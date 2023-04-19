public class Combo {
    private Burguer burger;
    private Sobremesa sobremesa;
    private Bebida bebida;
    public Combo()
    {
        this.burger = new Burguer();
        this.sobremesa = new Sobremesa();
        this.bebida = new Bebida();
    }

    public void criarCombo(int combo){

        switch (combo) {
            case 1:
                burger.setGramas(500);
                burger.setDescricao("Picanha");
                burger.setPreco(50);
                sobremesa.setTamanho("Super Grande");
                sobremesa.setPreco(20);
                sobremesa.setDescricao("Sorvete");
                bebida.setMl(500);
                bebida.setPreco(15);
                bebida.setDescricao("Coca-Cola");
                break;
            case 2:
                burger.setGramas(300);
                burger.setDescricao("Peixe");
                burger.setPreco(35);
                sobremesa.setTamanho("Grande");
                sobremesa.setPreco(12);
                sobremesa.setDescricao("Sorvete");
                bebida.setMl(500);
                bebida.setPreco(15);
                bebida.setDescricao("Coca-Cola");
                break;
            default:
                burger.setGramas(0);
                burger.setDescricao("Não existe");
                burger.setPreco(0);
                sobremesa.setTamanho("Não existe");
                sobremesa.setPreco(0);
                sobremesa.setDescricao("Não existe");
                bebida.setMl(0);
                bebida.setPreco(0);
                bebida.setDescricao("Não existe");
                break;
        }
    }

    @Override
    public String toString(){
        double valorTotal = this.burger.getPreco()+this.bebida.getPreco()+this.sobremesa.getPreco();
        return "Burger : " + this.burger.getDescricao()+"\r\n"+
                "Gramas : " + this.burger.getGramas()+"\r\n"+
                "Preço :" + this.burger.getPreco()+"\r\n"+
                "Sobremesa :" + this.sobremesa.getDescricao()+"\r\n"+
                "Tamanho :" + this.sobremesa.getTamanho()+"\r\n"+
                "Preço :" + this.sobremesa.getPreco()+"\r\n"+
                "Bebida: " + this.bebida.getDescricao()+"\r\n"+
                "Ml :" + this.bebida.getMl()+"\r\n"+
                "Preço :" + this.bebida.getPreco()+"\r\n"+
                "\r\n"+
                "Total : " + valorTotal;
    }

}
