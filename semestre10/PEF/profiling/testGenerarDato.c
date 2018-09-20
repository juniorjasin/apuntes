#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <assert.h>

double GenerarDato();

int main(int argc, char *argv[])
{
    srand(time(NULL));

    for (int i = 0; i < 1000; i++)
    {
        double dato = GenerarDato();
        assert(dato > -2000 && dato < 2000);
    }

    return 0;
}

double GenerarDato()
{
    double numero = 0.0;
    numero = (rand() % 4000) -2000;
    return numero;
}