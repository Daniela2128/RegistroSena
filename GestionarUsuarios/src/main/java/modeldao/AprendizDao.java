/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeldao;

import interfaz.MeAprendiz;
import java.util.List;
import modelo.Aprendiz;

/**
 *
 * @author APRENDIZ
 */
public class AprendizDao implements MeAprendiz{

    @Override
    public Aprendiz list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listadoA() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean registrarap(Aprendiz ap) {
        
       String sql="insert into Aprendiz(Docu,Nombreap,Apellidoap,Correoap,Numcontacto)values('"+ap.getDocuap()+"','"+ap.getNombreap()+"','"+ap.getApellidoap()+"','"+ap.getCorreoap()+"','"+ap.Teleap()+"')";
       try{
       
       }catch()
       {
       }
       return false;
    }

    @Override
    public boolean actualizarap(Aprendiz ap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarap(Aprendiz ap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
