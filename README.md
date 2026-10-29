# Reto-1-
Reto #1 Ejercicios Anton

Este repositorio se compone de tres ejercicios en relación al Reto de evaluación de la asignatura Programación, con su respectivo enunciado en PDF y su solución escrita en (.java). La versión de cada una de ellas es la de “Eclipse Temurin 17.0.20”.

## Primer Ejercicio

En el primer ejercicio se pide calcular el total de chicles que he comido en total, tomando en cuenta la oferta o recompensa que se obtiene al cumplir una condición, siendo una cantidad definida de chicles por usuario. El usuario únicamente introducirá tantas veces como quiera que haya de casos y hasta que los tres números de entradas no sean ceros pedirá que introduzca más casos. Los tres números representan el número de envoltorios necesarios para obtener la oferta, el número de chicles como recompensa, y el número de chicles que compras inicialmente. 

El número de chicles que compras se le suma al número de chicles que obtiene si el usuario ha comprado un número de chicles mayor que el número de envoltorios necesitados. Así se le suma la cantidad de chicles, una y otra vez hasta que deje de cumplir la oferta. La operación matemática sería:

$C < E$

- **N**: Chicles comprados
- **E**: Envoltorios que necesitas
- **C**: Chicles que te dan al cumplir E

Si cumples la oferta el cálculo es:

$$
\text{Nuevos chicles} = \left(\frac{A}{E}\right) \cdot C, \quad A (\text{número de envoltorios actuales}) = N, \quad A,E,C \in \mathbb{N}
$$

$$
\text{Número de envoltorios restantes} = (A \bmod E) + \text{Nuevos chicles}, \quad \text{Nuevos chicles} \in \mathbb{N}
$$

Termina el cálculo hasta que el número de envoltorios restantes $< E$.

$$
C \ge E
$$

El resultado es = ruina.

Para ello se usará...

## Segundo Ejercicio

En el segundo ejercicio se pide calcular la suma descendente de cuántos números enteros positivos, reales y naturales quiera el usuario. Hasta que no ponga el dígito 0, no empezará la ejecución de calcular el resultado.

La operación sería la siguiente:

$$
ABCD + BCD + CD + D
$$

Para ello se usara...

## Tercer Ejercicio

Y el último ejercicio pide calcular el número total de litros que se deben comprar para llenar un número definido por el usuario de acuarios que están colocados de forma descendente, donde el usuario debe especificar el número de casos que quiere hacer la operación, y ya después se escribirá en una misma línea el número de acuarios, la cantidad de litros que tiene el acuario más grande y la diferencia de litros que tienen los acuarios.

La operación matemática es la siguiente:

$$
\text{Total de litros} = n \cdot C - D \cdot \frac{n \cdot (n-1)}{2}, \quad n \in \mathbb{N}, \quad C,D \in \mathbb{R}
$$

- **n**: número de acuarios
- **C**: cantidad total del acuario máximo
- **D**: Diferencia de litros

Para ello se usará...
