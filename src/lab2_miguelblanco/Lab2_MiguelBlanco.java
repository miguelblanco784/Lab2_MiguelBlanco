package lab2_miguelblanco;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2_MiguelBlanco {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<Empleado> lista = new ArrayList();
    static Random r = new Random();

    public static void main(String[] args) {
        //       lista.add(new Empleado("Miguel", "Blanco", "Morado", 18, "Masculino", 1.80, 150, "Ingeniero en 1", "Gerente"));
        lista.add(new Empleado("Miguel", "Blanco", "Morado", 18, "Masculino", 1.80, 150, "Ingeniero en 2", "Gerente"));
        lista.add(new Empleado("Miguel", "Blanco", "Morado", 18, "Masculino", 1.80, 150, "Ingeniero en 3", "Gerente"));
        lista.add(new Empleado("Miguel", "Blanco", "Morado", 18, "Masculino", 1.80, 150, "Ingeniero en 4", "Aseador"));
        lista.add(new Empleado("Miguel", "Blanco", "Morado", 18, "Masculino", 1.80, 150, "Ingeniero en 5", "Aseador"));
        lista.add(new Empleado("Miguel", "Blanco", "Morado", 18, "Masculino", 1.80, 150, "Ingeniero en 6", "Cajero"));
        lista.add(new Empleado("Miguel", "Blanco", "Morado", 18, "Masculino", 1.80, 150, "Ingeniero en 7", "Cajero"));
        lista.add(new Empleado("Miguel", "Blanco", "Morado", 18, "Masculino", 1.80, 150, "Ingeniero en 8", "Seguridad"));
        System.out.println("1. Registro de emplados \n"
                + "2. Despedir Empleados\n"
                + "3. Log In\n"
                + "4. Ascender Cajero\n"
                + "5. Listar Empleados\n"
                + "6. Modificae Empleados\n"
                + "7. RANDOM");
        System.out.print("Ingrese Opcion: ");
        int opcion = leer.nextInt();
        //Esta opcion no deja al usuario ingresar al menu real si no le da a la opcion de login primero.
        while (opcion != 3) {
            System.out.println("TIENE QUE HACER LOGIN PRIMERO!!");
            System.out.println("1. Registro de emplados \n"
                    + "2. Despedir Empleados\n"
                    + "3. Log In\n"
                    + "4. Ascender Cajero\n"
                    + "5. Listar Empleados\n"
                    + "6. Modificae Empleados\n"
                    + "7. RANDOM");
            System.out.print("Ingrese Opcion: ");
            opcion = leer.nextInt();
        }
        menu(opcion);
    }

    public static void menu(int opcion) {
        String nombre = "",
                apellido = "",
                color = "",
                genero = "",
                titulo = "",
                cargo = "";
        int edad = 0;
        double altura = 0.0,
                peso = 0.0;
        while (true) {
            switch (opcion) {
                case 1:
                    for (int i = 0; i < 9; i++) {
                        switch (i) {
                            case 0:
                                System.out.print("Ingrese nombre: ");
                                nombre = leer.next();
                                break;
                            case 1:
                                System.out.print("Ingrese apellido: ");
                                apellido = leer.next();
                                break;
                            case 2:
                                System.out.print("Ingrese color favorito: ");
                                color = leer.next();
                                break;
                            case 3:
                                System.out.print("Ingrese edad: ");
                                edad = leer.nextInt();
                                break;
                            case 4:
                                System.out.println("Masculino = m\n"
                                        + "Femenino = f");
                                System.out.print("Ingrese genero: ");
                                char generochar = leer.next().charAt(0);
                                if (generochar == 'f' || generochar == 'F') {
                                    genero = "Femenino";
                                } else {
                                    genero = "Masculino";
                                }
                                break;
                            case 5:
                                System.out.print("Ingrese su altura: ");
                                altura = leer.nextDouble();
                                break;
                            case 6:
                                System.out.print("Ingrese peso: ");
                                peso = leer.nextDouble();
                                break;
                            case 7:
                                System.out.print("Ingrese su titulo: ");
                                titulo = leer.next();
                                break;
                            case 8:
                                System.out.println("a. Gerente\n"
                                        + "b. Aseadores\n"
                                        + "c. Cajeros\n"
                                        + "d. Seguridad");
                                System.out.print("Ingrese cargo: ");
                                char cargochar = leer.next().charAt(0);
                                switch (cargochar) {
                                    case 'a':
                                        int c1 = 0;
                                        for (int j = 0; j < lista.size(); j++) {
                                            if (lista.get(j).getCargo().equals("Gerente")) {
                                                c1++;
                                            }
                                        }
                                        System.out.println(c1);
                                        if (c1 == 3) {
                                            System.out.println("Ya existen 3 gerentes!");
                                            System.out.println("b. Aseadores\n"
                                                    + "c. Cajeros\n"
                                                    + "d. Seguridad");
                                            System.out.print("Ingrese cargo: ");

                                            char cargochar1 = leer.next().charAt(0);
                                            switch (cargochar1) {
                                                case 'b':
                                                    cargo = "Aseador";
                                                    break;
                                                case 'c':
                                                    cargo = "Cajero";
                                                    break;
                                                case 'd':
                                                    cargo = "Seguridad";
                                                    break;
                                                default:
                                                    throw new AssertionError();
                                            }

                                        } else {
                                            cargo = "Gerente";
                                        }
                                        break;
                                    case 'b':
                                        cargo = "Aseador";
                                        break;
                                    case 'c':
                                        cargo = "Cajero";
                                        break;
                                    case 'd':
                                        cargo = "Seguridad";
                                        break;
                                    default:
                                        throw new AssertionError();
                                }

                                break;
                            default:
                                throw new AssertionError();
                        }//fin switch
                    }//fin for

                    lista.add(new Empleado(nombre, apellido, color, edad, genero, altura, peso, titulo, cargo));
                    System.out.println(lista);
                    break;
                case 2:
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(i + 1 + "- " + lista.get(i).getNombre() + " " + lista.get(i).getApellido() + " " + lista.get(i).getCargo());
                    }
                    System.out.print("Desea despedir a: ");
                    int posd = leer.nextInt() - 1;
                    lista.remove(posd);
                    break;
                case 3:
                    System.out.print("Ingrese usuario: ");
                    String usuario = leer.next();
                    System.out.print("Ingrese contaseña: ");
                    String contrasena = leer.nextLine();
                    contrasena = leer.nextLine();
                    boolean p = usuario.equals("leobanegas") && contrasena.equals("99");
                    if (p) {
                        p = false;
                    } else {
                        p = true;
                    }
                    while (p) {
                        System.out.println("USUARIO O CONTASENA INCORRECTA!");
                        System.out.print("Ingrese usuario: ");
                        usuario = leer.next();
                        System.out.print("Ingrese contaseña: ");
                        contrasena = leer.nextLine();
                        contrasena = leer.nextLine();
                        p = usuario.equals("leobanegas") && contrasena.equals("99");
                        if (p) {
                            p = false;
                        } else {
                            p = true;
                        }
                    }
                    break;
                case 4:
                    int c1 = 0;
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getCargo().equals("Gerente")) {
                            c1++;
                        }
                    }
                    if (c1 == 3) {
                        System.out.println("Ya existen 3 gerentes!");

                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i).getCargo().equals("Cajero")) {
                                System.out.println(i + 1 + "- " + lista.get(i).getNombre() + " " + lista.get(i).getApellido() + " " + lista.get(i).getCargo());
                            }
                        }
                    }
                    System.out.print("Ingrese el cajero que desea Ascender: ");
                    int num1 = leer.nextInt();
                    lista.get(num1).setCargo("Gerente");
                    break;
                case 5:
                    System.out.println("Gerentes: ");
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getCargo().equals("Gerente")) {
                            System.out.println(lista.get(i).getNombre() + " " + lista.get(i).getApellido() + " " + lista.get(i).getCargo());
                        }
                    }
                    System.out.println("Cajeros: ");
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getCargo().equals("Cajero")) {
                            System.out.println(lista.get(i).getNombre() + " " + lista.get(i).getApellido() + " " + lista.get(i).getCargo());
                        }
                    }
                    System.out.println("Seguridad: ");
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getCargo().equals("Seguridad")) {
                            System.out.println(lista.get(i).getNombre() + " " + lista.get(i).getApellido() + " " + lista.get(i).getCargo());
                        }
                    }
                    System.out.println("Aseadores: ");
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getCargo().equals("Aseador")) {
                            System.out.println(lista.get(i).getNombre() + " " + lista.get(i).getApellido() + " " + lista.get(i).getCargo());
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(i + 1 + "- " + lista.get(i));
                    }
                    System.out.print("Ingrese usuario que quiere modificar: ");
                    int usuario1 = leer.nextInt();
                    System.out.print("1. Nombre\n"
                            + "2. Apellido\n"
                            + "3. ColorFav\n"
                            + "4. Edad\n"
                            + "5. Genero\n"
                            + "6. Altura\n"
                            + "7. Peso\n"
                            + "8. Titulo\n"
                            + "9. Cargo\n");
                    System.out.print("Ingrese modificacion: ");
                    int mod = leer.nextInt() - 1;
                    switch (mod) {
                        case 0:
                            System.out.print("Ingrese nombre: ");
                            String a1 = leer.next();
                            lista.get(usuario1).setNombre(a1);
                            break;
                        case 1:
                            System.out.print("Ingrese apellido: ");
                            String apellido1 = leer.next();
                            lista.get(usuario1).setApellido(apellido1);
                            break;
                        case 2:
                            System.out.print("Ingrese color favorito: ");
                            String color1 = leer.next();
                            lista.get(usuario1).setColorFav(color1);
                            break;
                        case 3:
                            System.out.print("Ingrese edad: ");
                            int edad1 = leer.nextInt();
                            lista.get(usuario1).setEdad(edad1);
                            break;
                        case 4:
                            System.out.println("Masculino = m\n"
                                    + "Femenino = f");
                            System.out.print("Ingrese genero: ");
                            char generochar = leer.next().charAt(0);
                            if (generochar == 'f' || generochar == 'F') {
                                genero = "Femenino";
                            } else {
                                genero = "Masculino";
                            }
                            lista.get(usuario1).setGenero(genero);
                            break;
                        case 5:
                            System.out.print("Ingrese su altura: ");
                            double altura1 = leer.nextDouble();
                            lista.get(usuario1).setAltura(altura1);
                            break;
                        case 6:
                            System.out.print("Ingrese peso: ");
                            double peso1 = leer.nextDouble();
                            lista.get(usuario1).setPeso(peso1);
                            break;
                        case 7:
                            System.out.print("Ingrese su titulo: ");
                            String titulo1 = leer.next();
                            lista.get(usuario1).setTitulo(titulo1);
                            break;
                        case 8:
                            String cargo1 = "";
                            System.out.println("a. Gerente\n"
                                    + "b. Aseadores\n"
                                    + "c. Cajeros\n"
                                    + "d. Seguridad");
                            System.out.print("Ingrese cargo: ");
                            char cargochar = leer.next().charAt(0);
                            switch (cargochar) {
                                case 'a':
                                    cargo1 = "Gerente";
                                    break;
                                case 'b':
                                    cargo1 = "Aseador";
                                    break;
                                case 'c':
                                    cargo1 = "Cajero";
                                    break;
                                case 'd':
                                    cargo1 = "Seguridad";
                                    break;

                                default:
                                    throw new AssertionError();
                            }
                            lista.get(usuario1).setCargo(cargo1);
                            break;
                        default:
                            throw new AssertionError();
                    }//fin switch
                    break;
                case 7:
                    System.out.print("Ingrese un numero del 1 al " + lista.size() + 1 + ": ");
                    int leer1 = leer.nextInt();
                    while (leer1 > lista.size()) {
                        System.out.print("Ingrese un numero del 1 al " + lista.size() + ": ");
                        leer1 = leer.nextInt();
                    }
                    for (int i = 0; i < leer1; i++) {
                        int empleador = 0 + r.nextInt(lista.size());
                        int cargor = 1 + r.nextInt(4);
                        switch (cargor) {
                            case 1:
                                int c2 = 0;
                                for (int j = 0; j > lista.size(); j++) {
                                    if (lista.get(j).getCargo().equals("Gerente")) {
                                        c2++;
                                    }
                                }
                                if (c2 == 3) {
                                    lista.get(empleador).setCargo("Gerente");

                                } else {
                                    lista.get(empleador).setCargo("Seguridad");
                                }
                                break;
                            case 2:
                                lista.get(empleador).setCargo("Aseador");
                                break;
                            case 3:
                                lista.get(empleador).setCargo("Cajero");
                                break;
                            case 4:
                                lista.get(empleador).setCargo("Seguridad");
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("1. Registro de emplados \n"
                    + "2. Despedir Empleados\n"
                    + "3. Log In\n"
                    + "4. Ascender Cajero\n"
                    + "5. Listar Empleados\n"
                    + "6. Modificae Empleados\n"
                    + "7. RANDOM\n"
                    + "0. Salir");
            System.out.print("Ingrese opcion: ");
            opcion = leer.nextInt();
        }//Fin ciclo del menu
    }

}
