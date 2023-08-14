
package poo;


public class Coleccion_furgonetas extends Furgoneta{
    
    public static void main(String[] args){
  
        
        Furgoneta [] coleccion = new Furgoneta[6];
        
                coleccion[0] = new Furgoneta(3,1000);
        
        coleccion[0].establece_color("Amarillo");
        coleccion[0].configura_asientos("si");
        coleccion[0].configura_climatizador("si");
        
        System.out.println("Los datos del coche 1 son: ");
        
        coleccion[0].dime_datos_generales();
        coleccion[0].dimeColor();
        coleccion[0].dime_asientos();
        coleccion[0].dime_climatizador();
        coleccion[0].dime_peso_coche();
        coleccion[0].dimeDatosFurgoneta();
        
                coleccion[1] = new Furgoneta(2,1500);
        
        coleccion[1].establece_color("Rojo");
        coleccion[1].configura_asientos("no");
        coleccion[1].configura_climatizador("si");
        
        System.out.println("Los datos del coche 2 son: ");
        
        coleccion[1].dime_datos_generales();
        coleccion[1].dimeColor();
        coleccion[1].dime_asientos();
        coleccion[1].dime_climatizador();
        coleccion[1].dime_peso_coche();
        coleccion[1].dimeDatosFurgoneta();
        
                coleccion[2] = new Furgoneta(5,2000);
        
        coleccion[2].establece_color("Verde");
        coleccion[2].configura_asientos("si");
        coleccion[2].configura_climatizador("no");
        
        System.out.println("Los datos del coche 3 son: ");
        
        coleccion[2].dime_datos_generales();
        coleccion[2].dimeColor();
        coleccion[2].dime_asientos();
        coleccion[2].dime_climatizador();
        coleccion[2].dime_peso_coche();
        coleccion[2].dimeDatosFurgoneta();
        
                coleccion[3] = new Furgoneta(3,500);
        
        coleccion[3].establece_color("Azul");
        coleccion[3].configura_asientos("no");
        coleccion[3].configura_climatizador("no");
        
        System.out.println("Los datos del coche 4 son: ");
        
        coleccion[3].dime_datos_generales();
        coleccion[3].dimeColor();
        coleccion[3].dime_asientos();
        coleccion[3].dime_climatizador();
        coleccion[3].dime_peso_coche();
        coleccion[3].dimeDatosFurgoneta();
        
                coleccion[4] = new Furgoneta(4,800);
        
        coleccion[4].establece_color("Negro");
        coleccion[4].configura_asientos("si");
        coleccion[4].configura_climatizador("si");
        
        System.out.println("Los datos del coche 5 son: ");
        
        coleccion[4].dime_datos_generales();
        coleccion[4].dimeColor();
        coleccion[4].dime_asientos();
        coleccion[4].dime_climatizador();
        coleccion[4].dime_peso_coche();
        coleccion[4].dimeDatosFurgoneta();
        
                coleccion[5] = new Furgoneta(10,5000);
        
        coleccion[5].establece_color("Blanco");
        coleccion[5].configura_asientos("no");
        coleccion[5].configura_climatizador("no");
        
        System.out.println("Los datos del coche 6 son: ");
        
        coleccion[5].dime_datos_generales();
        coleccion[5].dimeColor();
        coleccion[5].dime_asientos();
        coleccion[5].dime_climatizador();
        coleccion[5].dime_peso_coche();
        coleccion[5].dimeDatosFurgoneta();
    }
}
