/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.Cliente;
import Vista.Interfaz;
import java.util.ArrayList;


public class Controlador {
    
    private Interfaz Vista;
    private Cliente cl;
    private ArrayList<Cliente> Clientes = new ArrayList();
    private ArrayList<Integer> Codigos = new ArrayList();
    
    public Controlador(Interfaz vista){
        this.Vista = vista;
        this.Vista.capturarDatosCliente(this);
    }
    
    public void GuardarClientes(Cliente cl){
        Clientes.add(cl);
    }
    
    public void GuardarCodigo(int id){
        Codigos.add(id);
    }
    
    public boolean Verificar(int id){
        return Codigos.contains(id);
    }

    public void actualizarVista(){
        Vista.ImprimirDatosClientes(Clientes);
    }
}

