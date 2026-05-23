/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lancadornotas;

import com.formdev.flatlaf.FlatLightLaf;
import com.mycompany.lancadornotas.model.Aluno;
import com.mycompany.lancadornotas.view.Principal;
import java.time.LocalDate;

/**
 *
 * @author alexisdanielkang
 */
public class LancadorNotas {

    public static void main(String[] args) {
        
        FlatLightLaf.setup();
              
        new Principal().setVisible(true);
    }
}
