package PersonagemAnime;

public class personagemMain {
    public static void main(String[] args) {
        // Hiro, energia vital de 100, poder destrutivo de 40, mana total de 20
        caracteristicasPersonagem personagem1 = new caracteristicasPersonagem(); // criei um novo objeto personagem
        personagem1.nomePersonagem = "Hiro";
        personagem1.energiaVital = 100;
        personagem1.poderDestrutivo = 40.0f;
        personagem1.manaTotal = 20;

        System.out.format("Olá! Me chamo %s! Minha energia vital é de %dhp, meu poder destrutivo é de %.1f, e atualmente minha mana é %d!", personagem1.nomePersonagem, personagem1.energiaVital, personagem1.poderDestrutivo, personagem1.manaTotal);
    }
}
