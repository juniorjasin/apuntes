#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <sys/time.h>

double** CrearMatriz   (int rows, int cols);
void     BorrarMatriz  (double **m, int rows);
void     CargarMatriz  (double **m, int rows, int cols);
void     MostrarMatriz (double **m, int rows, int cols, FILE *out);

double   GenerarDato();
void     SumarElementos (double **m, double **n, int rows, int cols);

struct timeval start, end;

int main (int argc, char *argv[]) {
  // muestro la hora q comenzo el main
  gettimeofday(&start, NULL);
  time_t nowtime = start.tv_sec;
  struct tm *nowtm = localtime(&nowtime);
  char buf1[1024]; // construct a string without microseconds
  strftime(buf1, 1024, "%Y-%m-%d %H:%M:%S", nowtm);
  char buf2[1024]; // append microseconds to end of string
  snprintf(buf2, 1024, "%s.%06ld", buf1, start.tv_usec);

  printf("%s\n", buf2);

  srand(time(NULL));
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
  
    FILE*foriginal = fopen("original.txt","w");
    MostrarMatriz(matrizOriginal,matrixRows, matrixCols,foriginal);

    FILE*faux = fopen("auxiliar.txt","w");
    MostrarMatriz(matrizAuxiliar,matrixRows, matrixCols,faux);

    SumarElementos(matrizOriginal,matrizAuxiliar,matrixRows,matrixCols);
    FILE*fresult = fopen("suma.txt","w");
    MostrarMatriz(matrizOriginal,matrixRows, matrixCols,fresult);

  }

  /* Se libera la memoria reservada para ambas matrices */
  BorrarMatriz(matrizOriginal,matrixRows);
  BorrarMatriz(matrizAuxiliar,matrixRows);
  
  gettimeofday(&end, NULL);  
  time_t nowtime2 = end.tv_sec;
  struct tm *nowtm2 = localtime(&nowtime2);
  char buf01[1024]; // construct a string without microseconds
  strftime(buf01, 1024, "%Y-%m-%d %H:%M:%S", nowtm2);
  char buf02[1024]; // append microseconds to end of string
  snprintf(buf02, 1024, "%s.%06ld", buf01, end.tv_usec);

  printf("%s\n", buf02);

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
      m[i][j]= GenerarDato();
    }
  }
}

/* Esta funcion genera un numero al azar */
double   GenerarDato() {
  double numero = 0.0;
  numero = rand() % 4000 + (-2000);
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
      m[j][i]= m[j][i] + n[j][i];
    }
  }
}


