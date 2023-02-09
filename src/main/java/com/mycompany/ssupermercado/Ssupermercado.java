
package com.mycompany.ssupermercado;

import java.util.Scanner;

public class Ssupermercado {
public static Scanner Scanner = new Scanner(System.in);
 public static String [] Productos = new String[10];
 public static int [] precios = new int[10];
 public static int [] Codigo = new int[6];
 public static int [] Descuento = new int[6];
 public static String [] Compra = new String[7];
    public static void main(String[] args) {
        
        
       int Usuario = 201901472;
       int Contraseña = 201901472;
        System.out.println("Ingrese su nombre de usuario:");
          int user = Scanner.nextInt();
          System.out.println("Ingrese su contraseña:");
           int pass = Scanner.nextInt(); 
        if (user==Usuario&&pass==Contraseña) {
           ListaOpciones();
        }else{System.out.println("Usuario y contraseña incorrectos");}
    }
         public static void ListaOpciones()
         {
             System.out.println("Bienvenido");
            System.out.println("_____________________________________________");
            System.out.println("1. Agregar nuevos productos");
            System.out.println("2. Agregar cupones de descuento");
            System.out.println("3. Realizar venta");
            System.out.println("4. Realizar reporte");
             System.out.println("5. Salir");
            System.out.println("Escriba el numeto correspondiente a la funcion que desea realizar");
         Menu();
         }
 public static void Menu()
    {
         int opcion = Scanner.nextInt();  
      switch(opcion)     
      {
          case 1:
              Producto();
              break;
          case 2:
              AgregarCupones();
              break;
          case 3:
              RealizarVenta();
              break;
          case 4:
               System.out.println("Gracias por utilizar mi aplicacion");
              break;  
      }}
 
      public static void AgregarProductos(){
          System.out.println("________________________");
          System.out.println("Presion 1 para añadir otro producto");
          System.out.println("presione 2 para volver al menu");
          int opcion1 =Scanner.nextInt();
          if (opcion1==1) {
              Producto();
          }if (opcion1==2) {
              ListaOpciones();
          }
          }
      
      
      public static void Producto(){
          
          for (int i = 0; i < precios.length; i++) {
              if (Productos[i]==null&&precios[i]==0) {
                  System.out.println("Ingrese el nombre de el producto");
                  String nombre = Scanner.next();
                   System.out.println("Ingrese el precio de el producto");
                   int precio =  Scanner.nextInt();
                   for (int j = 0; j < precios.length; j++) {
              if (nombre.equals(Productos[j])||precio==0) {
                  System.out.println("El producto ya existe o el precio ingresado no es superior a 0");
                   AgregarProductos();
                  break; 
                }else {
                  Productos[i]=nombre;
                  precios[i]=precio;
                  System.out.println("El producto se creo con exito");
                  AgregarProductos();
                  break;   
              } 
              }
              }
          } 
      }
      
      
      public static void AgregarCupones(){
          
       for (int i = 0; i < precios.length; i++) {
              if (Codigo[i]==0&&Descuento[i]==0) {
                  System.out.println("Ingrese el codigo de el cupon");
                  String cupon = Scanner.next();
                  
                   System.out.println("Ingrese el descuento");
                   int porcentaje=  Scanner.nextInt();
                   for (int j = 0; j < precios.length; j++) {
              if (Integer.parseInt(cupon)==Codigo[j]&&porcentaje==0&&cupon.length()!=4) {
                  System.out.println("Algund dato ingresado es incorrecto");
                   CodigoDescuento();
                  break; 
                }else if(cupon.length()==4&&porcentaje>0){
                  Codigo[i]=Integer.parseInt(cupon);
                  Descuento[i]=porcentaje/100;
                  System.out.println("El cupon se creo con exito");
                  CodigoDescuento();
                  break;   
              }else{
                  System.out.println("Algun dato es incorrecto");} 
                  CodigoDescuento();
                  break; 
              }
              }
          } 
      }
        public static void CodigoDescuento(){
        System.out.println("________________________");
          System.out.println("Presion 1 para añadir otro cupon");
          System.out.println("presione 2 para volver al menu");
          int opcion1 =Scanner.nextInt();
          if (opcion1==1) {
              AgregarCupones();
          }if (opcion1==2) {
              ListaOpciones();
          }
        }
        

        public static void RealizarVenta(){
            System.out.println("Productos disponibles:");
            for (int i = 0; i < Productos.length; i++) {
                if (Productos[i]!= null) {
                    System.out.println(i+"." + " producto: " + Productos[i] + " ; " + " precio: " + precios[i]);  
                }  
            }
             System.out.println("Ingrese el numero correspondiente a los productos que desea adquirir");
                System.out.println("Solo puede adquirir un maximo de 6 productos por cliente");
          Venta();
        }
        
        public static void Venta(){
            int i= 0;
            boolean vandera =false;
            
            do {
                
                int numero =Scanner.nextInt();
               Compra[i]=String.valueOf(numero);
                System.out.println("si desea agregar otro prodcuto presione 1, en caso contrario presione 2"); 
                int opcion =Scanner.nextInt();
                System.out.println("el numero de el producto es: " + Compra[i]);
                System.out.println("Ingrese el numero correspondiente a otro producto");
                if (opcion==1) {
                    vandera=true;
                }else{
                vandera= false;
                
                }
                
            } while (i<=Compra.length&&vandera==true);
            System.out.println("Productos añadidos con exito");
                Final();
               
                }
        
        public static void Final(){
            System.out.println("Ingrese su nombre para continuar");
             String name =Scanner.next();
             System.out.println("Ingrese su nit si no dispone de uno escriba cf");
               String nic =Scanner.next();
               int total = 0;
                 for (int i = 0; i < Compra.length; i++) {
                     if (Compra[i]!=null) {    
                     total =total + precios[Integer.parseInt(Compra[i])];
                     }
                     System.out.println("el total es " + total );
            }       
        }
        
         public static void Factura(){
         
         
         
         
         }
        
        
        
            }
        
        

        



         
    


