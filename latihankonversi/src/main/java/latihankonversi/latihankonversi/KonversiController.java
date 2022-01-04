/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihankonversi.latihankonversi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import Service.Konversi.ServiceKonversi;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
/**
 *
 * @author fiezi
 */

@Controller

public class KonversiController 
{
    ServiceKonversi Serv = new ServiceKonversi();
    
    @RequestMapping("/input")
    public String Rupiah(HttpServletRequest uang, Model konver) {
        
        String Rupiah = uang.getParameter("rupiah");        
        Double InputRupiah = Double.valueOf(Rupiah);     
        
        
        Double RPkeRM = InputRupiah * 0.00029;                
        konver.addAttribute("Ringgit", RPkeRM);
        
        Double RPkePound = InputRupiah * 0.000052;
        konver.addAttribute("Pound", RPkePound);
        
        Double RPkeUSD = InputRupiah * 0.000070;
        konver.addAttribute("Dollar", RPkeUSD);        
        
        String Paket = Serv.Rupee(uang, konver);
        String Paket2 = Serv.Ringgit(uang, konver);
        
        return "ViewData";       
       
    }
}


