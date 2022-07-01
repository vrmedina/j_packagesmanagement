
package empresapaquetes;

import java.util.Scanner;

public class Main {
    
    public static int buscarSucursal(Sucursal s[], int contadorSucursal, int numeroSucursal) {
        int indice = 0;
        boolean encontrado = false;
        for (int i = 0; i < contadorSucursal; i++) {
            if (s[i].getNumeroSucursal() == numeroSucursal) {
                encontrado = true;
                indice = i;
            }
        }
        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }
    
    public static int buscarPaquete(Paquete p[], int contadorPaquete, int numeroPaquete) {
        int indice = 0;
        boolean encontrado = false;
        for (int i = 0; i < contadorPaquete; i++) {
            if (p[i].getNumeroPaquete() == numeroPaquete) {
                encontrado = true;
                indice = i;
            }
        }
        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeroSucursal, contadorSucursal=0, contadorPaquete=0, prioridad, opcion, indiceSucursal, indicePaquete, numeroPaquete, cedula;
        String direccion, ciudad;
        double peso, precioPaquete;
        Sucursal sucursal[] = new Sucursal[50];
        Paquete paquete[] = new Paquete[100];
        
        do {
            System.out.println("\t*** Menu ***");
            System.out.println("1. Crear sucursal");
            System.out.println("2. Enviar paquete");
            System.out.println("3. Consultar sucursal");
            System.out.println("4. Consultar paquete");
            System.out.println("5. Mostrar todas las sucursales");
            System.out.println("6. Mostrar todos los paquetes");
            System.out.println("7. Salir");
            System.out.print("Digite la opcion: ");
            opcion = in.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Digite el numero de sucursal: ");
                    numeroSucursal = in.nextInt();
                    in.nextLine();
                    System.out.print("Digite la direcion: ");
                    direccion = in.nextLine();
                    System.out.print("Digite la ciudad: ");
                    ciudad = in.nextLine();
                    
                    sucursal[contadorSucursal] = new Sucursal(numeroSucursal, direccion, ciudad);
                    contadorSucursal++;
                    System.out.println("Sucursal creada exitosamente!");
                    break;
                case 2:
                    System.out.print("Digite el numero de sucursal: ");
                    numeroSucursal = in.nextInt();
                    indiceSucursal = buscarSucursal(sucursal, contadorSucursal, numeroSucursal);
                    if (indiceSucursal == -1) {
                        System.out.println("La sucursal no existe");
                    }else {
                        System.out.print("Digite el numero de paquete: ");
                        numeroPaquete = in.nextInt();
                        in.nextLine();
                        System.out.print("Digite la cedula: ");
                        cedula = in.nextInt();
                        System.out.print("Digite el peso del paquete: ");
                        peso = in.nextDouble();
                        System.out.print("Digite la prioridad(0=normal 1=alta 2=express): ");
                        prioridad = in.nextInt();
                        
                        paquete[contadorPaquete] = new Paquete(numeroPaquete, cedula, peso, prioridad);
                        precioPaquete = sucursal[indiceSucursal].precioPaquete(paquete[contadorPaquete]);
                        System.out.println("El precio del paquete es: $"+precioPaquete);
                        
                        contadorPaquete++;
                    }
                    break;
                case 3:
                    System.out.print("Digite el numero de sucursal: ");
                    numeroSucursal = in.nextInt();
                    indiceSucursal = buscarSucursal(sucursal, contadorSucursal, numeroSucursal);
                    
                    if (indiceSucursal == -1) {
                        System.out.println("La sucursal no existe");
                    }else {
                        System.out.println("Los datos de la sucursal son: ");
                        System.out.println(sucursal[indiceSucursal].datosSucursal());
                    }
                    break;
                case 4:
                    System.out.print("Digite el numero de paquete: ");
                    numeroPaquete = in.nextInt();
                    indicePaquete = buscarPaquete(paquete, numeroPaquete, contadorPaquete);
                    
                    if (indicePaquete == -1) {
                        System.out.println("El paquete no existe");
                    }else {
                        System.out.println("Los datos del paquete son: ");
                        System.out.println(paquete[indicePaquete].datosPaquete());
                    }
                    break;
                case 5:
                    for (int i = 0; i < contadorSucursal; i++) {
                        System.out.println("Los datos de la sucursal ["+(i+1)+"] son: ");
                        System.out.println(sucursal[i].datosSucursal());
                    }
                    break;
                case 6:
                    for (int i = 0; i < contadorPaquete; i++) {
                        System.out.println("Los datos del paquete ["+(i+1)+"] son: ");
                        System.out.println(paquete[i].datosPaquete());
                    }
                    break;
                case 7:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("La opcion digitada no existe en el menu");
            }
            System.out.println("");
        }while(opcion != 7);
    }
}
