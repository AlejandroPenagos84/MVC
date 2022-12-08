/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Control.Controlador;
import Modelo.Cliente;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;



public class Interfaz  {
    private Scanner lector;
    public Interfaz(){
        lector = new Scanner(System.in);
    }
    
    public void capturarDatosCliente(Controlador control){
        int id;
        String nombre;
        String apellido;
        
        int op = 0;
        while(op != 3){
            System.out.println("--------------------------------------");
            System.out.println("1. Agregar Usuarios");
            System.out.println("2. Mostrar Usuarios");
            System.out.println("3. Salir ");
            System.out.print("Ingresa una opción: ");
            op = lector.nextInt();
            
            if(op == 1){
                System.out.println("-------------Ingrese los datos del Cliente------------------");
                System.out.print("ID: ");
                id = lector.nextInt();
                while (control.Verificar(id)){
                    System.out.print("ID no válido, intenta de nuevo");
                    id = lector.nextInt();
                }
                System.out.print("Nombre: ");
                nombre = lector.next();
                System.out.print("Apellido: ");
                apellido = lector.next();
                Cliente cl = new Cliente(nombre,apellido,id);
                control.GuardarClientes(cl);
                control.GuardarCodigo(id);
            }else if(op == 2){
                control.actualizarVista();
            }
            else if(op == 3){
                break;
            }
        }
    }
    
    public void ImprimirDatosClientes(ArrayList<Cliente> clientes){
        if(clientes.isEmpty()){
            System.out.println("No hay Clientes");
        }else{
            for(int i = 0; i < clientes.size(); i++){
                System.out.println("----------------------------------------------------------------------------------------------------");
                System.out.println("Datos Cliente #"+(i+1));
                System.out.println("Id: "+clientes.get(i).getId());
                System.out.println("Nombre: "+clientes.get(i).getNombre());
                System.out.println("Apellido: "+clientes.get(i).getApellido());
            }      
        }
    }
}
