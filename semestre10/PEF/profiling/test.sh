printf " test matrices pasando dos parametros iguales \n";
matriz_correcta="1 100 1000 5000";
for e in $matriz_correcta; do
    # printf "matriz de %s %s\n" $e $e;
    ./prog-old $e $e > salida.$e;
done


printf " test matrices pasando dos parametros distintos \n";
matriz_rows="1 100 1000 4000";
matriz_cols="2 200 3000 5000";
for r in $matriz_rows; do
    for c in $matriz_cols; do
        # printf "matriz de %s %s\n" $r $c;
        ./prog-old $r $c;
    done
done


printf " test matrices pasando un solo parametro \n";
matriz_size="2 200 3000 5000";
for r in $matriz_rows; do
    # printf "matriz de %s %s\n" $r $c;
    ./prog-old $r;
done


printf " test matrices sin pasar parametros \n";
matriz_size="2 200 3000 5000";
for r in $matriz_rows; do
    # printf "matriz de %s %s\n" $r $c;
    ./prog-old $r;
done