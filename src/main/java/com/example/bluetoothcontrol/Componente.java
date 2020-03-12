package com.example.bluetoothcontrol;

public class Componente
{

    int funcao;

    String nomeComponenteArduinoEixoY, pinoComponenteEixoYArduino;

    public String getNomeComponenteArduinoEixoY() {
        return nomeComponenteArduinoEixoY;
    }

    public void setNomeComponenteArduinoEixoY(String nomeComponenteArduinoEixoY) {
        this.nomeComponenteArduinoEixoY = nomeComponenteArduinoEixoY;
    }

    public String getPinoComponenteEixoYArduino() {
        return pinoComponenteEixoYArduino;
    }

    public void setPinoComponenteEixoYArduino(String pinoComponenteEixoYArduino) {
        this.pinoComponenteEixoYArduino = pinoComponenteEixoYArduino;
    }

    boolean usarArduino;

    public boolean isUsarArduino() {
        return usarArduino;
    }

    public void setUsarArduino(boolean usarArduino) {
        this.usarArduino = usarArduino;
    }

    String funcaoScketch;

    String funcaoScketchEixoX;
    String funcaScketchEixoY;

    public String getFuncaoScketchEixoX() {
        return funcaoScketchEixoX;
    }

    public void setFuncaoScketchEixoX(String funcaoScketchEixoX) {
        this.funcaoScketchEixoX = funcaoScketchEixoX;
    }

    public String getFuncaScketchEixoY() {
        return funcaScketchEixoY;
    }

    public void setFuncaScketchEixoY(String funcaScketchEixoY) {
        this.funcaScketchEixoY = funcaScketchEixoY;
    }

    int arduinoWrite;

    public int getArduinoWrite() {
        return arduinoWrite;
    }

    public void setArduinoWrite(int arduinoWrite) {
        this.arduinoWrite = arduinoWrite;
    }

    public String getFuncaoScketch() {
        return funcaoScketch;
    }

    public void setFuncaoScketch(String funcaoScketch) {
        this.funcaoScketch = funcaoScketch;
    }

    public int getFuncao() {
        return funcao;
    }

    public void setFuncao(int funcao) {
        this.funcao = funcao;
    }

    boolean isPino, isModo, isFuncao;

    public boolean isPino() {
        return isPino;
    }

    public void setPino(boolean pino) {
        isPino = pino;
    }

    public boolean isModo() {
        return isModo;
    }

    public void setModo(boolean modo) {
        isModo = modo;
    }

    public boolean isFuncao() {
        return isFuncao;
    }

    public void setFuncao(boolean funcao) {
        isFuncao = funcao;
    }

    int modoPino;

    public int getModoPino() {
        return modoPino;
    }

    public void setModoPino(int modoPino) {
        this.modoPino = modoPino;
    }

    String nomeComponenteArduino;

    public String getNomeComponenteArduino() {
        return nomeComponenteArduino;
    }

    public void setNomeComponenteArduino(String nomeComponenteArduino) {
        this.nomeComponenteArduino = nomeComponenteArduino;
    }

    int modoOperacao;

     String pin;

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    int modoOperacaoEixoX;
     int modoOperacaoEixoY;

     int intervaloInicioEixoX;
     int intervaloFimEixoX;
     int escopoEixoX;

     int tipoArduino;

    public int getTipoArduino() {
        return tipoArduino;
    }

    public void setTipoArduino(int tipoArduino) {
        this.tipoArduino = tipoArduino;
    }

    int intervaloInicioEixoY;
    int intervaloFimEixoY;

    public int getModoOperacaoEixoX() {
        return modoOperacaoEixoX;
    }

    public void setModoOperacaoEixoX(int modoOperacaoEixoX) {
        this.modoOperacaoEixoX = modoOperacaoEixoX;
    }

    public int getModoOperacaoEixoY() {
        return modoOperacaoEixoY;
    }

    public void setModoOperacaoEixoY(int modoOperacaoEixoY) {
        this.modoOperacaoEixoY = modoOperacaoEixoY;
    }

    public int getIntervaloInicioEixoX() {
        return intervaloInicioEixoX;
    }

    public void setIntervaloInicioEixoX(int intervaloInicioEixoX) {
        this.intervaloInicioEixoX = intervaloInicioEixoX;
    }

    public int getIntervaloFimEixoX() {
        return intervaloFimEixoX;
    }

    public void setIntervaloFimEixoX(int intervaloFimEixoX) {
        this.intervaloFimEixoX = intervaloFimEixoX;
    }

    public int getEscopoEixoX() {
        return escopoEixoX;
    }

    public void setEscopoEixoX(int escopoEixoX) {
        this.escopoEixoX = escopoEixoX;
    }

    public int getIntervaloInicioEixoY() {
        return intervaloInicioEixoY;
    }

    public void setIntervaloInicioEixoY(int intervaloInicioEixoY) {
        this.intervaloInicioEixoY = intervaloInicioEixoY;
    }

    public int getIntervaloFimEixoY() {
        return intervaloFimEixoY;
    }

    public void setIntervaloFimEixoY(int intervaloFimEixoY) {
        this.intervaloFimEixoY = intervaloFimEixoY;
    }

    public int getEscopoEixoY() {
        return escopoEixoY;
    }

    public void setEscopoEixoY(int escopoEixoY) {
        this.escopoEixoY = escopoEixoY;
    }

    int escopoEixoY;






    public int getModoOperacao() {
        return modoOperacao;
    }

    public void setModoOperacao(int modoOperacao) {
        this.modoOperacao = modoOperacao;
    }

    int idComponente;

    boolean eixoX;
    boolean eixoY;

    int tipoBotao;
    int rotacaoBotao;

    int cor, formato;

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }

    public int getFormato() {
        return formato;
    }

    public void setFormato(int formato) {
        this.formato = formato;
    }

    public int getTipoBotao() {
        return tipoBotao;
    }

    public void setTipoBotao(int tipoBotao) {
        this.tipoBotao = tipoBotao;
    }

    public int getRotacaoBotao() {
        return rotacaoBotao;
    }

    public void setRotacaoBotao(int rotacaoBotao) {
        this.rotacaoBotao = rotacaoBotao;
    }

    String chaveInicioEixoX;
    String chaveFimEixoX;

    public boolean isEixoX() {
        return eixoX;
    }

    public void setEixoX(boolean eixoX) {
        this.eixoX = eixoX;
    }

    public boolean isEixoY() {
        return eixoY;
    }

    public void setEixoY(boolean eixoY) {
        this.eixoY = eixoY;
    }

    public String getChaveInicioEixoX() {
        return chaveInicioEixoX;
    }

    public void setChaveInicioEixoX(String chaveInicioEixoX) {
        this.chaveInicioEixoX = chaveInicioEixoX;
    }

    public String getChaveFimEixoX() {
        return chaveFimEixoX;
    }

    public void setChaveFimEixoX(String chaveFimEixoX) {
        this.chaveFimEixoX = chaveFimEixoX;
    }

    public String getChaveInicioEixoY() {
        return chaveInicioEixoY;
    }

    public void setChaveInicioEixoY(String chaveInicioEixoY) {
        this.chaveInicioEixoY = chaveInicioEixoY;
    }

    public String getChaveFimEixoY() {
        return chaveFimEixoY;
    }

    public void setChaveFimEixoY(String chaveFimEixoY) {
        this.chaveFimEixoY = chaveFimEixoY;
    }

    String chaveInicioEixoY;
    String chaveFimEixoY;


    int intervaloInicio, intervaloFim;

    public int getIntervaloInicio() {
        return intervaloInicio;
    }

    public void setIntervaloInicio(int intervaloInicio) {
        this.intervaloInicio = intervaloInicio;
    }

    public int getIntervaloFim() {
        return intervaloFim;
    }

    public void setIntervaloFim(int intervaloFim) {
        this.intervaloFim = intervaloFim;
    }

    String chaveInicio, chaveFim;

    public String getChaveInicio() {
        return chaveInicio;
    }

    public void setChaveInicio(String chaveInicio) {
        this.chaveInicio = chaveInicio;
    }

    public String getChaveFim() {
        return chaveFim;
    }

    public void setChaveFim(String chaveFim) {
        this.chaveFim = chaveFim;
    }

    public int getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(int idComponente) {
        this.idComponente = idComponente;
    }

    String nomeComponente;
    String caracterEnvio;
    int positionX;
    int positionY;
    String tipo;

    public String getNomeComponente() {
        return nomeComponente;
    }

    public void setNomeComponente(String nomeComponente) {
        this.nomeComponente = nomeComponente;
    }

    public String getCaracterEnvio() {
        return caracterEnvio;
    }

    public void setCaracterEnvio(String caracterEnvio) {
        this.caracterEnvio = caracterEnvio;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }




     int desabilitarOpcoesJoystick;

    public int getDesabilitarOpcoesJoystick() {
        return desabilitarOpcoesJoystick;
    }

    public void setDesabilitarOpcoesJoystick(int desabilitarOpcoesJoystick) {
        this.desabilitarOpcoesJoystick = desabilitarOpcoesJoystick;
    }

    public Componente()
    {


    }






}