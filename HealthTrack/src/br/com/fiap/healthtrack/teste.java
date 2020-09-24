package br.com.fiap.healthtrack;

import java.util.Scanner;

public interface teste {
    public static void main(String[] args) {
        ResumoDAO whateverDao = new ResumoDAO();
        Scanner scan = new Scanner(System.in);

        /**
         * - Sistema com input de usuário
         * System.out.println("Olá, Para fazer o teste de inserção e recepção de dados, preciso que você insira alguns dados\n");
        System.out.println("Passos: ");
        whateverDao.setPassos(scan.nextInt());

        System.out.println("Peso :");
        whateverDao.setPeso(scan.nextInt());         

        System.out.println("Ultima vez que se pesou: (yyyymmdd)");
        whateverDao.setDataPeso(scan.nextInt());

        System.out.println("Altura: ");
        whateverDao.setAltura(scan.nextDouble());
        

        int calcImc = (int) (whateverDao.getPeso()/(whateverDao.getAltura()*whateverDao.getAltura()));
        whateverDao.setImc(calcImc);

        System.out.println("kcal gastas: ");
        whateverDao.setKcal(scan.nextInt());

        System.out.println("Seu esporte principal: ");
        whateverDao.setEsportePrincipal(scan.next());

        System.out.println("Quantos anos pratica esse esporte?: ");
        whateverDao.setAnosPratica(scan.nextInt());

        System.out.println("Qual sua meta com esse aplicativo: ");
        String minhaMeta = scan.next();
        minhaMeta += scan.nextLine();
        whateverDao.setMeta(minhaMeta); */

        whateverDao.setPassos(6000);
        whateverDao.setAltura(1.7);
        whateverDao.setPeso(90);
        whateverDao.setDataPeso(20200923);
        whateverDao.setKcal(1200);
        whateverDao.setImc((int) (whateverDao.getPeso()/(whateverDao.getAltura()*whateverDao.getAltura())));
        whateverDao.setEsportePrincipal("Futebol");
        whateverDao.setAnosPratica(6);
        whateverDao.setcoposAgua(9);
        whateverDao.setMeta("Peder peso");

        System.out.println("\nSuas informaçoões com base na classe ResumoDAO\n");
        String[] response = whateverDao.getAll();

        for (int c = 0; c<response.length; c++){
            System.out.println(response[c]);
        }

        System.out.println("\n\n\tPassos: "+response[0]);
        System.out.println("\tPeso: "+ response[1]+" kg");
        System.out.println("\tSua altura: "+response[3]+"m");
        System.out.println("\tSeu IMC: "+ response[2]);
        System.out.println("\tSuas calorias perdidas: "+response[4]+"kcal");
        System.out.println("\tSeu esporte praticado: "+response[6]);
        System.out.println("\tVocê pratica esse esporte por: "+ response[7]+ " anos");
        System.out.println("\tData da ultima alteração de peso: "+response[8]);
        System.out.println("\tSua meta é: "+response[5]);
    }
}
