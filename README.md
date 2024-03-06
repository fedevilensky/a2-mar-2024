# Repositorio Estructura de Datos y Algoritmos 2, Marzo 2024

- [Repositorio Estructura de Datos y Algoritmos 2, Marzo 2024](#repositorio-estructura-de-datos-y-algoritmos-2-marzo-2024)
  - [Instalacion](#instalacion)
  - [WSL](#wsl)
  - [Instalar Compiladores](#instalar-compiladores)
  - [Compilar, Ejecutar, y Debuggear](#compilar-ejecutar-y-debuggear)
    - [C++](#c)
      - [Compilar C++](#compilar-c)
      - [Ejecutar C++](#ejecutar-c)
      - [Debuggear C++](#debuggear-c)
    - [Java](#java)
      - [Compilar Java](#compilar-java)
      - [Ejecutar Java](#ejecutar-java)
      - [Debuggear Java](#debuggear-java)
  - [Comandos basicos de la terminal](#comandos-basicos-de-la-terminal)
  - [Lecturas siguientes](#lecturas-siguientes)

## Instalacion

Vamos a estar utilizando sistemas operativos *nix para llevar a cabo el curso. Esto es unix/linux/macOs

Los que utilicen Windows 10/11 deberan [instalar WSL](#wsl) y una distribucion de linux (recomiendo Ubuntu)

Los que estan en mac/linux, van directo a la seccion de [instalar compiladores](#instalar-compiladores)

## WSL

[Instrucciones de Microsoft](https://docs.microsoft.com/en-us/windows/wsl/install-win10#manual-installation-steps)

1. Abrir powershell COMO ADMINISTRADOR y escribir:

```powershell
wsl --install
```

2. Reiniciar la compu si nos pide

3. (Opcional, pero hace que ande mas rapido) En una terminal de powershell COMO ADMINISTRADOR (si este paso falla, no pasa nada, vamos al siguiente)

```powershell
wsl --set-default-version 2
```

## Instalar Compiladores

- C++ - Podemos elegir el compilador `clang++` o `g++`
  - Ubuntu/Debian/Mint:
    - Primero tenemos que cargar la base de datos del package manager

    ```bash
    sudo apt update
    ```

    - Luego instalamos el compilador que queremos
      - clang

      ```bash
      sudo apt install -y clang
      ```

      - g++

      ```bash
      sudo apt install -y g++
      ```

      - Lo que significa cada comando
        - `sudo` nos da permisos de administrador ("Super User DO")
        - `apt install` apt es el package manager (como un app store) install es el comando para instalar un paquete
        - `-y` esto es opcional, le estamos diciendo que aceptamos todo, sino antes de instalar nos va a pregutnar si aceptamos y tenemos que poner `yes`
        - `clang` o `g++` el paquete que queremos instalar
  - MacOS:
    - Abren una terminal y escriben `clang++` o `g++` y dan enter
    - Esto va a hacer que salte un prompt preguntando si quieren instalar las "command line tools", le dan que si y queda instalado
- Java
  - Ubuntu: `sudo apt install -y openjdk-17-jdk`
  - MacOS: seguir instrucciones para instalar [zulu-xx-jdk](https://docs.azul.com/core/zulu-openjdk/install/macos)

## Compilar, Ejecutar, y Debuggear

En ambos casos vamos a trabajar todo el codigo en unico archivo para simplificar. Esto va a significar codigo repetido, ya que vamos a tener que tener el TAD en el mismo archivo que nuestra solucion, pero a la hora de compilar les va a ser mas facil

### C++

#### Compilar C++

Ambos compiladores funcionan igual, los ejemplos los vamos a escribir con `clang++`, pero basta sustituirlo por `g++` para utilizar el otro compilador
En la terminal estando parados sobre la misma carpeta que el archivo que queremos compilar

```bash
clang++ ./archivo.cpp -o ejecutable
```

#### Ejecutar C++

Para ejecutar el programa, parados sorbe la misma carpeta que el archivo que queremos ejecutar

- Si queremos hacer el input a mano `./ejecutable`
- Si queremos que el input lo tome de un .txt `./ejecutable < ./input.txt`
- Si queremos que el output lo escriba en un archivo `./ejecutable > ./output.txt`
- Si queremos que el input lo tome de un archivo y el output lo escriba en un archivo `./ejecutable < ./input.txt > ./output.txt`

#### Debuggear C++

Para debuggear debemos instalar un debugger, si estan en mac ya deberian tener instalado `lldb`, sino si lo escriben en una terminal y dan enter deberia instalarselo

Si estan en linux

- Si usan clang `sudo apt install -y lldb`
- Si usan g++ `sudo apt install -y gdb`

Luego si hacemos F5 en vscode, deberia saltar un cartel que nos dice que no tenemos una configuracion y nos ofrece una automaticamente

----------------------------------------

Otra opcion es el viejo y querido

```c++
cout << "mi variable" << variable << endl;
```

----------------------------------------

### Java

#### Compilar Java

En la terminal estando parados sobre la misma carpeta que el archivo que queremos compilar

```bash
javac ./ejemplo.java
```

Esto nos va a generar un archivo `ejemplo.class`

#### Ejecutar Java

Para ejecutar el programa, parados sorbe la misma carpeta que el archivo que queremos ejecutar

- Si queremos hacer el input a mano `java ./ejemplo`
- Si queremos que el input lo tome de un .txt `java ./ejemplo < ./input.txt`
- Si queremos que el output lo escriba en un archivo `java ./ejemplo > ./output.txt`
- Si queremos que el input lo tome de un archivo y el output lo escriba en un archivo `ejemplo ./ejemplo < ./input.txt > ./output.txt`

#### Debuggear Java

Abrimos el archivo en visual studio code, presionamos F5

----------------------------------------
Otra opcion es el viejo y querido

```java
System.out.println("mi variable: " + variable);
```

----------------------------------------

## Comandos basicos de la terminal

| Comando                           | Descripcion                                                                                                                 |
| --------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `cd <directory>`                  | Change Directory: nos movemos a \<directory>                                                                                |
| `cd ..`                           | Nos movemos una carpeta para arriba                                                                                         |
| `ls`                              | List: lista los elementos de la carpeta que estamos parados                                                                 |
| `cat <file1> <file2> ... <filen>` | Concatenate: imprime en la terminal los archivos que le pasamos                                                             |
| `echo "cualquier mensaje"`        | Imprime el mensaje en la terminal                                                                                           |
| `<comando1> \| <comando2>`        | Toma el output del comando1 y lo ingresa como input al comando2                                                             |
| `<comando> < <archivo>`           | Ejecuta comando y le pasa el archivo como input (linea por linea, es decir, entre cada linea es como que presionemos enter) |
| `<comando> > <archivo>`           | Ejecuta el comando y guarda el output en el archivo                                                                         |

## Lecturas siguientes

- ## [Qué es un shell?](Que_es_un_shell.md)

- ## [Uso basico del shell](Uso_basico.md)

- ## [Uso de VS Code](Uso_de_VS_Code.md)
