package coleccionesejemplo;

import java.util.*;


public class ColeccionesEjemplo {

    static Scanner sc=new Scanner(System.in);
    //Definir las colecciones
    private static List<String> ListaNombres = new ArrayList<>();
    private static Set<String> conjuntoCorreos = new HashSet<>();
    private static Map<Integer, String> mapaUsuarios = new HashMap<>();
       
    public static void main(String[] args) {
        int opcion;
        boolean salir=false;
        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Almacenar Nombres");
            System.out.println("2. Almacenar Correos");
            System.out.println("3. Almacenar Usuarios");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();//leerEntero();

            switch (opcion) {
                case 1:
                    menuList();
                    break;
                case 2:
                    menuSet();
                    break;
                case 3:
                    menuMap();
                    break;
                case 4:
                    salir=true;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }//sw
        } while (!salir);
    }//main principal
    
    
    //Metodos para invocar los menús de las colecciones
    //PARA LIST
    private static void menuList() {
        int opcion;
        do {
            System.out.println("\n--- MENÚ LIST ---");
            System.out.println("1. Agregar nombre");
            System.out.println("2. Eliminar nombre");
            System.out.println("3. Mostrar lista");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();//leerEntero();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre a almacenar");
                    ListaNombres.add(sc.nextLine());
                    System.out.println("Se ha registrado el nombre!");
                    break;
                case 2:
                //validar si la coleccion no esta vacia
                if (!ListaNombres.isEmpty()) {
                    System.out.println("Que nombre quieres eliminar?");
                    String nom = sc.nextLine();
                    //validar si el nombre esta en la lista
                    if (ListaNombres.contains(nom)) {
                        ListaNombres.remove(nom);
                        System.out.println("Se ha eliminado el nombre con exito!");
                        
                    }    
                }else{
                    System.out.println("La Coleccion esta vacia!");
                }
                   
                    break;
                case 3:
                    System.out.println("Listas de nombres " + ListaNombres);
                    break;
                case 0:   
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }//sw
        } while (opcion != 0);
    }

    //PARA SET
    private static void menuSet() {
        int opcion;
        do {
            System.out.println("\n--- MENÚ SET ---");
            System.out.println("1. Agregar correo");
            System.out.println("2. Eliminar correo");
            System.out.println("3. Mostrar correos");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();//leerEntero();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el correo a almacenar");
                    conjuntoCorreos.add(sc.nextLine());
                    break;
                case 2:
                    //Validar si el correo esta
                    if (!conjuntoCorreos.isEmpty()) {
                        System.out.println("Ingrese correo que desea eliminar");
                        String cor = sc.nextLine();
                        //validar si el nombre esta en la lista
                        if (conjuntoCorreos.contains(cor)) {
                            conjuntoCorreos.remove(cor);
                            System.out.println("Se ha eliminado correctamente el correo!");
                            
                        }
                    }else{
                        System.out.println("La coleccion esta vacia!");
                    }
                    break;
                case 3:
                    System.out.println("lista de de correos" + conjuntoCorreos);
                    break;
                case 0: break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }//sw
        } while (opcion != 0);
    }//metodo

    //PARA MAP
    private static void menuMap() {
        int opcion;
        do {
            System.out.println("\n--- MENÚ MAP ---");
            System.out.println("1. Agregar usuario (clave, valor)");
            System.out.println("2. Eliminar usuario por clave");
            System.out.println("3. Mostrar usuarios");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();//leerEntero();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el ID(Numero):");
                    int id = sc.nextInt();
                    System.out.println("Ingrese el usuario:");
                    String user = sc.nextLine();
                    mapaUsuarios.put(id, user);
                    System.out.println("se ha registrado al usuario!");
                    break;
                case 2:
                    //validar si no esta vacia la coleccion
                    if (!mapaUsuarios.isEmpty()) {
                        System.out.println("Ingrese el ID(numero):");
                        int id2 = sc.nextInt();
                        if (mapaUsuarios.containsKey(id2)) {
                            mapaUsuarios.remove(id2);
                            System.out.println("Usuario eliminado correctamente");
                            
                        }else{
                            System.out.println("el usuario no esta almacenado");
                        }

                        
                    }
                    break;
                case 3:
                    System.out.println("Usuarios almacenados");
                    for (Map.Entry<Integer,String> entrada:mapaUsuarios.entrySet()) {
                        System.out.println("ID: " + entrada.getKey());
                        
                    }
                    break;
                case 0: break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }//sw
        } while (opcion != 0);
    }//metodo
    
}//clase
