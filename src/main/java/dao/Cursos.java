/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ivan
 */

@XmlRootElement (name = "Rows")
public class Cursos {
    
    private List<Curso> cursos = new ArrayList<Curso>();

    public Cursos() {
    }
    
    @XmlElement(name = "Row")
    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return cursos.toString();
    }
    
}
