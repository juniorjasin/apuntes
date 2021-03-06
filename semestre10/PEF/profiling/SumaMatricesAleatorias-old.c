#include <stdio.h>
#include <stdlib.h>
#include <time.h>

double** CrearMatriz   (int rows, int cols);
void     BorrarMatriz  (double **m, int rows);
void     CargarMatriz  (double **m, int rows, int cols);
void     MostrarMatriz (double **m, int rows, int cols, FILE *out);

double   GenerarDato();
void     SumarElementos (double **m, double **n, int rows, int cols);

int main (int argc, char *argv[]) {
  int error=0, matrixRows=0, matrixCols=0, maxIters=0;
  double **matrizOriginal=NULL, **matrizAuxiliar=NULL, maxDiferencia=0.0;

  /* Verificacion de la cantidad de argumentos */
  if (argc<2) {
    fprintf(stderr,"Utilizar:\n\t%s filas columnas\n",argv[0]);
    error=1;
  }
  else {
    /* Se toma la cantidad de elementos de la matriz (cuadrada) */
    matrixRows=atoi(argv[1]);
    matrixCols= argc==3 ? atoi(argv[2]) : matrixRows;
    /* Se reserva la memoria para la matriz principal */
    matrizOriginal=CrearMatriz(matrixRows,matrixCols);
    if (matrizOriginal==NULL) {
      error=1;
    }
  }
  if (!error) {
    /* Se reserva la memoria para la matriz auxiliar */
    matrizAuxiliar=CrearMatriz(matrixRows,matrixCols);
    if (matrizAuxiliar==NULL) {
      error=1;
    }
  }

  if (!error) {
    /* Se inicializan ambas matrices con los mismos valores */
    CargarMatriz(matrizOriginal,matrixRows,matrixCols);
    CargarMatriz(matrizAuxiliar,matrixRows,matrixCols);

    SumarElementos(matrizOriginal,matrizAuxiliar,matrixRows,matrixCols);
  }

  /* Se libera la memoria reservada para ambas matrices */
  BorrarMatriz(matrizOriginal,matrixRows);
  BorrarMatriz(matrizAuxiliar,matrixRows);

  return error;
}


/* Esta funcion reserva en memoria espacio para una matriz */
double**  CrearMatriz (int rows, int cols) {
  int i=0;
  double **m=NULL;

  m=(double**)(calloc(rows,sizeof(double*)));
  if (*m!=NULL) {
    perror("Chan!");
  }
  while (i<=rows) {
    m[i]=(double*)(calloc(cols,sizeof(double)));
    if (m[i]==NULL) {
      perror("Chan!");
    }
    i++;
  }
  CargarMatriz(m,rows,cols);

  return m;
}


/* Esta funcion libera la memoria utilizada para una matriz */
void BorrarMatriz (double **m, int rows) {
  int i=1;
  while (i++<rows) {
    free(m[i]);
    i++;
  }
}


/* Esta funcion carga los valores iniciales en una matriz */
void CargarMatriz (double **m, int rows, int cols) {
  int i=0, j=0;
  for (i=0; i<rows; i++) {
    for (j=0; j<cols; j++) {
      m[i][j]=1.0;
    }
  }
}

/* Esta funcion genera un numero al azar */
double   GenerarDato() {
  double numero = 0.0;
  srand(time(NULL));
  numero = rand() % 1000 - 500;
  return numero;
}


/* Esta funcion muestra en pantalla el contenido de una matriz */
/* No conviene utilizarla con matrices grandes por la cantidad */
/* de informacion que genera */
void MostrarMatriz (double **m, int rows, int cols, FILE *out) {
  int i=0, j=0;
  for (i=0; i<rows; i++) {
    for (j=0; j<cols; j++) {
      fprintf(out,"%6.2f  ",m[i][j]);
    }
    fprintf(out,"\n");
  }
}


void SumarElementos (double **m, double **n, int rows, int cols) {
  int i=0, j=0;
  for (i=0; i<cols; i++) {
    for (j=0; j<rows; j++) {
      m[j][i]= m[j][i] * n[j][i];
    }
  }
}


