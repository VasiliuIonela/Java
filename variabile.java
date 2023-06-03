public class variabile {
    public static void main(String[] args) {
        String marcaMasina="Volvo";
        String modelMasina="XC 60";
        System.out.println("Am cumparat o masina marca:" +marcaMasina);
        System.out.println("Este modelul:" + modelMasina);

        //suprascriere
        modelMasina="XC 60 facelift";
        System.out.println("Am cumparat o masina marca:" +marcaMasina);
        System.out.println("Este modelul:" + modelMasina);

        String nume;
        String prenume;
        nume="Marcu";
        prenume="Madalin";
        int varsta= 30;
        System.out.println("Numele prorpietarului este: " + nume+ " "+ prenume + " si are vasrta de: " + varsta + " ani");
    }
}
