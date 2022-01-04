/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Konversi;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author fiezi
 */
public class ServiceKonversi 
{
    @RequestMapping("/Input")
    public String Rupee(HttpServletRequest uang2, Model konver2) {
        
        String Rupee = uang2.getParameter("rupee");        
        Double InputRupee = Double.valueOf(Rupee);     
        
        Double RupeekeRM = InputRupee * 0.056;                
        konver2.addAttribute("Ringgit2", RupeekeRM);
        Double RupeekePound = InputRupee * 0.0099;
        konver2.addAttribute("Pound2", RupeekePound);
        Double RupeekeUSD = InputRupee * 0.013;
        konver2.addAttribute("Dollar2", RupeekeUSD);        

        
        return ""; 
    }
    
    public String Ringgit(HttpServletRequest uang3, Model konver3) {
        
        String Ringgit = uang3.getParameter("ringgit");        
        Double InputRupee = Double.valueOf(Ringgit);     
        
        Double Rupiah = InputRupee * 3000;
        konver3.addAttribute("Rupiah", Rupiah);        
        Double Rupe = InputRupee * 17.84;
        konver3.addAttribute("Rupee", Rupe);
        Double USD = InputRupee * 0.24;                
        konver3.addAttribute("Dolar", USD);
        
        return ""; 
    
    }
}
