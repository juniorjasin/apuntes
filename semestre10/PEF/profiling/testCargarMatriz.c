#include <stdio.h>
#include <stdlib.h>
#include <assert.h>
#include <time.h>

void CargarMatriz();

int main(int argc, char *argv[])
{
    srand(time(NULL));
    int ii=0;
    double **m = NULL;
    int cols = 10;
    int rows = 10;

    m = CrearMatriz(rows, cols);
    CargarMatriz(m, rows, cols);

    
    // verifico que dos poiciones diferentes tengan valores diferentes
    // no esta bien, porque podrian fallar, pero salvaria los casos
    // donde se ingrese el mismo numero en todas las casillas
    int posicion_random1 = rand() % cols;
    int posicion_random2 = rand() % cols;
    assert(m[posicion_random1][posicion_random1] != m[posicion_random2][posicion_random2]);
}

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

/* Esta funcion carga los valores iniciales en una matriz */
void CargarMatriz(double **m, int rows, int cols)
{
    int i = 0, j = 0;
    for (i = 0; i < rows; i++)
    {
        for (j = 0; j < cols; j++)
        {
            m[i][j] = 1.0;
        }
    }
}