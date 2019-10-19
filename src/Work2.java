public class Work2 {
    public String text = "Unreal Engine — игровой движок, разрабатываемый и поддерживаемый компанией Epic games. " +
            "Первой игрой на этом движке был шутер от первого лица Unreal, выпущенный в 1998 году. " +
            "Хотя движок первоначально был предназначен для разработки шутеров от первого лица, его последующие версии успешно применялись в играх самых различных жанров, в том числе стелс-играх, файтингах и массовых многопользовательских ролевых онлайн-играх. " +
            "В прошлом движок распространялся на условиях оплаты ежемесячной подписки. " +
            "C 2015 года Unreal Engine бесплатен. ";

    public int counter = 0;

    public char[] arrText = text.toCharArray();
    public StringBuilder sp = new StringBuilder();

    public void PrintArr_text(){ System.out.println(arrText); }

    public StringBuilder Increase(StringBuilder sb , int a , int b){
        String str1 = sb.substring(a, b);
        String strr1 = str1.toUpperCase();
        sb.replace(a, b, strr1);

        return sb;
    }

    public void Division() { for (int i = 0; i < text.length(); i++) { if(arrText[i] == '.' || arrText[i] == '?' || arrText[i] == '!') { arrText[i + 1] = '\n'; } } }

    public void TextIncrease() {
        sp.append(arrText);

        for(int i = 0; i < text.length(); i++){
            if(arrText[i] == ' '){
                sp = Increase(sp, 0, i);
                break;
            }
        }

        for (int i = text.length() - 2; i > 0; i--) {
            if(arrText[i] == ' '){
                sp = Increase(sp, i, text.length() - 2);
                break;
            }
        }
        System.out.println(sp);
     }

     public void FuncCounter(){
        for (int i = 0; i < text.length(); i++) { if (arrText[i] == '.' || arrText[i] == '?' || arrText[i] == '!') { counter++; } }

        String str = text  + "Количество предложений в тексте = " + counter;
        System.out.println(str);
     }
    }

