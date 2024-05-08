public class Relogio {

private int hora;
private int minuto;
private int segundo;

//Construtor Vazio
public Relogio(){

}

//Tradicional (Inserindo Atributos)
public Relogio (int hora, int minuto, int segundo){
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
}
     
//Inserindo apenas Horas e Minutos

public Relogio (int hora, int minuto){
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = 0;
}

//Inserindo apenas Horas

public Relogio (int hora){
this.hora = hora;
this.minuto = 0;
this.segundo = 0;

}

public int getHora() {
    return hora;
}

public void setHora(int hora) {
    this.hora = hora;
}

public int getMinuto() {
    return minuto;
}

public void setMinuto(int minuto) {
    this.minuto = minuto;
}

public int getSegundo() {
    return segundo;
}

public void setSegundo(int segundo) {
    this.segundo = segundo;
}





}
