public class Work {
    public static String text = "Unreal Engine — игровой движок, разрабатываемый и поддерживаемый компанией Epic games. " +
            "Первой игрой на этом движке был шутер от первого лица Unreal, выпущенный в 1998 году. " +
            "Хотя движок первоначально был предназначен для разработки шутеров от первого лица, его последующие версии успешно применялись в играх самых различных жанров, в том числе стелс-играх, файтингах и массовых многопользовательских ролевых онлайн-играх. " +
            "В прошлом движок распространялся на условиях оплаты ежемесячной подписки. " +
            "C 2015 года Unreal Engine бесплатен.  ";

    public static String newString = "Все элементы игрового движка представлены в виде объектов, имеющих набор характеристик, и класса, который определяет доступные характеристики.";

    public int counter = 0;

    public char[] arrText = text.toCharArray();
    public char[] arrString = newString.toCharArray();

    public void PrintArr_text(){ System.out.println(arrText); }

    public char Transformation(char c) {
        String s = String.valueOf(c);
        String ss = s.toLowerCase();
        char cc = ss.charAt(0);

        return cc;
    }

    public void Division() { for (int i = 0; i < text.length(); i++) { if(arrText[i] == '.' || arrText[i] == '?' || arrText[i] == '!') { arrText[i + 1] = '\n'; } } }

    public void Reduction() {
        Division();

        Transformation(arrText[0]);
        arrText[0] = Transformation(arrText[0]);

        for (int i = 0; i < text.length(); i++) { if ( arrText[i] == '\n') { arrText[i + 1] = Transformation(arrText[i + 1]); } }
    }

    public void SearchElement(){
        System.out.println(text);

        for (int i = 0; i < text.length(); i++) { if (arrText[i] == 'a' && arrText[i + 1] == 'm') { counter++; } }

        System.out.println("Counter(am) = " + counter);
    }

    public void NumberWord_newString(){
        for (int i = 0; i < newString.length() ; i++) { if (arrString[i] == ' ' || arrString[i] == '.' || arrString[i] == '?' || arrString[i] == '!') { counter++; } }

        String str = newString + "Количество слов в предложении = " + counter;

        System.out.println(str);
    }
}
