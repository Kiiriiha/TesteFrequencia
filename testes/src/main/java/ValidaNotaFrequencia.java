public class ValidaNotaFrequencia {
    public String validar(int nota, int frequencia) {
        if (frequencia < 70 && frequencia >= 0){
            return "Reprovado";
        }
       else if(nota < 6 && nota >= 0){
           return "Reprovado";
        }
       else if(nota >= 6 || frequencia >= 70) {
           return "Aprovado";
        }
       else {
           throw new IllegalArgumentException("Não é permitido valroes negativos");
        }

    }
}
