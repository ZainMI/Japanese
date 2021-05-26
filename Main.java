//Zain Magdon-Ismail
//Learn Japanese
import java.util.Scanner;

class Main {
    public static void Japanese(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice="";
        boolean cont=true;
        choice=askType();
        if (choice.equalsIgnoreCase("practice")){
            while (cont==true){
                alphabet(stringArrays());
                System.out.println("Would you like to choose another alphabet? (Yes/No)");
                choice=validYN();
                if (choice.equalsIgnoreCase("no")){
                    cont=false;
                    System.out.println("Ok");
                }
            }
        }
        else if (choice.equalsIgnoreCase("learn")){
            while (cont==true){
                learn(stringArrays());
                System.out.println("Would you like to choose another alphabet?");
                choice=validYN();
                if (choice.equalsIgnoreCase("no")){
                    cont=false;
                    System.out.println("Ok");
                }
            }
        }
    }

    //Strings
    public static String[][] stringArrays(){
        String[][] hiragana ={{"あ","い","う","え","お","か","き","く","け","こ","さ","し","す","せ","そ","た","ち","つ","て","と","な","に","ぬ","ね","の","は","ひ","ふ","へ","ほ","ま","み","む","め","も","や","ゆ","よ","ら","り","る","れ","ろ","わ","ゐ","ゑ","を","ん"},
                {"a","i","u","e","o","ka","ki","ku","ke","ko","sa","shi","su","se","so","ta","chi","tsu","te","to","na","ni","nu","ne","no","ha","hi","fu","he","ho","ma","mi","mu","me","mo","ya","yu","yo","ra","ri","ru","re","ro","wa","wi","we","wo","n"}};
        String[][] katakana ={{"ア","イ","ウ","エ","オ","カ","キ","ク","ケ","コ","サ","シ","ス","セ","ソ","タ","チ","ツ","テ","ト","ナ","ニ","ヌ","ネ","ノ","ハ","ヒ","フ","ヘ","ホ","マ","ミ","ム","メ","モ","ヤ","ユ","ヨ","ラ","リ","ル","レ","ロ","ワ","ヰ","ヱ","ヲ","ン"},
                {"a","i","u","e","o","ka","ki","ku","ke","ko","sa","shi","su","se","so","ta","chi","tsu","te","to","na","ni","nu","ne","no","ha","hi","fu","he","ho","ma","mi","mu","me","mo","ya","yu","yo","ra","ri","ru","re","ro","wa","wi","we","wo","n"}};
        String[][] hiraDakuten ={{"が","ぎ","ぐ","げ","ご","ざ","じ","ず","ぜ","ぞ","だ","ぢ","づ","で","ど","ば","び","ぶ","べ","ぼ","ぱ","ぴ","ぷ","ぺ","ぽ"},
                {"ga","gi","gu","ge","go","za","ji","zu","ze","zo","da","dji","dzu","de","do","ba","bi","bu","be","bo","pa","pi","pu","pe","po"}};
        String[][] kataDakuten ={{"ガ","ギ","グ","ゲ","ゴ","ザ","ジ","ズ","ゼ","ゾ","ダ","ヂ","ヅ","デ","ド","バ","ビ","ブ","ベ","ボ","パ","ピ","プ","ペ","ポ"},
                {"ga","gi","gu","ge","go","za","ji","zu","ze","zo","da","ji","zu","de","do","ba","bi","bu","be","bo","pa","pi","pu","pe","po"}};
        String[][] hiraCombined ={{"きゃ","きゅ","きょ","しゃ","しゅ","しょ","ちゃ","ちゅ","ちょ","にゃ","にゅ","にょ","ひゃ","ひゅ","ひょ","みゃ","みゅ","みょ","りゃ","りゅ","りょ"},
                {"kya","kyu","kyo","sha","shu","sho","cha","chu","cho","nya","nyu","nyo","hya","hyu","hyo","mya","myu","myo","rya","ryu","ryo"}};
        String[][] kataCombined ={{"キャ","キュ","キョ","シャ","シュ","ショ","チャ","チュ","チョ","ニャ","ニュ","ニョ","ヒャ","ヒュ","ヒョ","ミャ","ミュ","ミョ","リャ","リュ","リョ"},
                {"kya","kyu","kyo","sha","shu","sho","cha","chu","cho","nya","nyu","nyo","hya","hyu","hyo","mya","myu","myo","rya","ryu","ryo"}};
        String[][] hiraCombDakuten={{"ぎゃ","ぎゅ","ぎょ","じゃ","じゅ","じょ","ぢゃ","ぢゅ","ぢょ","びゃ","びゅ","びょ","ぴゃ","ぴゅ","ぴょ"},
                {"gya","gyu","gyo","ja","ju","jo","dja","dju","djo","bya","byu","byo","pya","pyu","pyo"}};
        String[][] kataCombDakuten={{"ギャ","ギュ","ギョ","ジャ","ジュ","ジョ","ヂャ","ヂュ","ヂョ","ビャ","ビュ","ビョ","ピャ","ピュ","ピョ"},
                {"gya","gyu","gyo","ja","ju","jo","ja","ju","jo","bya","byu","byo","pya","pyu","pyo"}};
        String[][] all={{"あ","い","う","え","お","か","き","く","け","こ","さ","し","す","せ","そ","た","ち","つ","て","と","な","に","ぬ","ね","の","は","ひ","ふ","へ","ほ","ま","み","む","め","も","や","ゆ","よ","ら","り","る","れ","ろ","わ","ゐ","ゑ","を","ん","ア","イ","ウ","エ","オ","カ","キ","ク","ケ","コ","サ","シ","ス","セ","ソ","タ","チ","ツ","テ","ト","ナ","ニ","ヌ","ネ","ノ","ハ","ヒ","フ","ヘ","ホ","マ","ミ","ム","メ","モ","ヤ","ユ","ヨ","ラ","リ","ル","レ","ロ","ワ","ヰ","ヱ","ヲ","ン","が","ぎ","ぐ","げ","ご","ざ","じ","ず","ぜ","ぞ","だ","ぢ","づ","で","ど","ば","び","ぶ","べ","ぼ","ぱ","ぴ","ぷ","ぺ","ぽ","ガ","ギ","グ","ゲ","ゴ","ザ","ジ","ズ","ゼ","ゾ","ダ","ヂ","ヅ","デ","ド","バ","ビ","ブ","ベ","ボ","パ","ピ","プ","ペ","ポ",
                    "きゃ","きゅ","きょ","しゃ","しゅ","しょ","ちゃ","ちゅ","ちょ","にゃ","にゅ","にょ","ひゃ","ひゅ","ひょ","みゃ","みゅ","みょ","りゃ","りゅ","りょ","キャ","キュ","キョ","シャ","シュ","ショ","チャ","チュ","チョ","ニャ","ニュ","ニョ","ヒャ","ヒュ","ヒョ","ミャ","ミュ","ミョ","リャ","リュ","リョ","ぎゃ","ぎゅ","ぎょ","じゃ","じゅ","じょ","ぢゃ","ぢゅ","ぢょ","びゃ","びゅ","びょ","ぴゃ","ぴゅ","ぴょ","ギャ","ギュ","ギョ","ジャ","ジュ","ジョ","ヂャ","ヂュ","ヂョ","ビャ","ビュ","ビョ","ピャ","ピュ","ピョ"},
                {"a","i","u","e","o","ka","ki","ku","ke","ko","sa","shi","su","se","so","ta","chi","tsu","te","to","na","ni","nu","ne","no","ha","hi","fu","he","ho","ma","mi","mu","me","mo","ya","yu","yo","ra","ri","ru","re","ro","wa","wi","we","wo","n","a","i","u","e","o","ka","ki","ku","ke","ko","sa","shi","su","se","so","ta","chi","tsu","te","to","na","ni","nu","ne","no","ha","hi","fu","he","ho","ma","mi","mu","me","mo","ya","yu","yo","ra","ri","ru","re","ro","wa","wi","we","wo","n","ga","gi","gu","ge","go","za","ji","zu","ze","zo","da","dji","dzu","de","do","ba","bi","bu","be","bo","pa","pi","pu","pe","po","ga","gi","gu","ge","go","za","ji","zu","ze","zo","da","ji","zu","de","do","ba","bi","bu","be","bo","pa","pi","pu","pe","po",
                    "kya","kyu","kyo","sha","shu","sho","cha","chu","cho","nya","nyu","nyo","hya","hyu","hyo","mya","myu","myo","rya","ryu","ryo","kya","kyu","kyo","sha","shu","sho","cha","chu","cho","nya","nyu","nyo","hya","hyu","hyo","mya","myu","myo","rya","ryu","ryo","gya","gyu","gyo","ja","ju","jo","dja","dju","djo","bya","byu","byo","pya","pyu","pyo","gya","gyu","gyo","ja","ju","jo","ja","ju","jo","bya","byu","byo","pya","pyu","pyo"}};

        String[][] x = {{},{}};
        String choice="";
        choice=askAlph();
        if (choice.equalsIgnoreCase("hiragana"))
            return hiragana;
        else if (choice.equalsIgnoreCase("katakana"))
            return katakana;
        else if (choice.equalsIgnoreCase("hiragana dakuten"))
            return hiraDakuten;
        else if (choice.equalsIgnoreCase("katakana dakuten"))
            return kataDakuten;
        else if (choice.equalsIgnoreCase("hiragana digraph"))
            return hiraCombined;
        else if (choice.equalsIgnoreCase("katakana digraph"))
            return kataCombined;
        else if (choice.equalsIgnoreCase("hiragana digraph dakuten"))
            return hiraCombDakuten;
        else if (choice.equalsIgnoreCase("katakana digraph dakuten"))
            return kataCombDakuten;
        else if (choice.equalsIgnoreCase("everything"))
            return all;
        return x;
    }

    //Learnings

    public static void learn(String[][] x){
        System.out.println("");
        System.out.println("Alright Let's Begin");
        Scanner ac = new Scanner(System.in);
        String answer="";
        boolean allCorrect=true;
        int a=0;
        for (int i=a; i<a+5 && a<x[0].length-5; i++){
            System.out.println(x[0][i]);
            answer=ac.nextLine();
            if (answer.equalsIgnoreCase(x[1][i])){
                System.out.println("Correct");
            }
            else{
                allCorrect=false;
                System.out.println("Wrong! The correct answer is "+x[1][i]);
            }
            if (allCorrect==false && i==a+4){
                i=a-1;
                allCorrect=true;
            }
            else if (allCorrect==true && i==a+4){
                a+=4;
                i=a;
            }
            System.out.println("");
        }
    }

    public static void alphabet(String[][] x){
        System.out.println("");
        System.out.println("Alright Let's Begin");
        Scanner ac = new Scanner(System.in);
        boolean allCorrect=true;
        int[] tally=new int[x[0].length];
        int rand=(int)(Math.random()*(x[0].length));
        String answer="";
        int count=0, totCount=0;
        for (int i=0;i<x[0].length;i++){
            while (tally[rand]!=0)
                rand=(int)(Math.random()*(x[0].length));
            tally[rand]=1;
            totCount++;
            System.out.println(x[0][rand]);
            answer=ac.nextLine();
            if (answer.equalsIgnoreCase(x[1][rand])){
                System.out.println("Correct");
                count++;
            }
            else{
                allCorrect=false;
                System.out.println("Wrong! The correct answer is "+x[1][rand]);
            }
            System.out.println("");
        }
        if (allCorrect==false){
            System.out.println("You got "+count+"/"+x[0].length+". Would you like to try again? (Yes/No)");
            answer= validYN();
            if (answer.equalsIgnoreCase("yes"))
                alphabet(x);
            else
                System.out.println("Okay");
        }
    }

    //Valids
    public static String validAlph(){
        Scanner sc = new Scanner(System.in);
        boolean valid=false;
        String choice="";
        while (valid==false){
            choice=sc.nextLine();
            if (choice.equalsIgnoreCase("hiragana") || choice.equalsIgnoreCase("katakana") || choice.equalsIgnoreCase("hiragana dakuten") || choice.equalsIgnoreCase("katakana dakuten") || choice.equalsIgnoreCase("hiragana digraph") || choice.equalsIgnoreCase("katakana digraph")|| choice.equalsIgnoreCase("hiragana digraph dakuten") || choice.equalsIgnoreCase("katakana digraph dakuten") || choice.equalsIgnoreCase("everything"))
                valid=true;
            else
                System.out.println("Please choose an available alphabet. What alphabet would you like to learn?");
        }
        return choice;
    }

    public static String validType(){
        Scanner sc = new Scanner(System.in);
        boolean valid=false;
        String choice="";
        while (valid==false){
            choice=sc.nextLine();
            if (choice.equalsIgnoreCase("practice") || choice.equalsIgnoreCase("learn"))
                valid=true;
            else
                System.out.println("Please choose an available choice. What would you like to do?");
        }
        return choice;
    }

    public static String validYN(){
        Scanner sc = new Scanner(System.in);
        boolean valid=false;
        String choice="";
        while (valid==false){
            choice=sc.nextLine();
            System.out.println("\f");
            if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("no"))
                valid=true;
            else
                System.out.println("Please enter 'Yes' or 'No'. Would you like to try again?");
        }
        return choice;
    }

    //Ask Methods
    public static String askAlph(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        System.out.println("「Hiragana」「Katakana」「Hiragana Dakuten」「Katakana Dakuten」「Hiragana Digraph」「Katakana Digraph」「Hiragana Digraph Dakuten」「Katakana Digraph Dakuten」「Everything」");
        System.out.println("What alphabet would you like to practice?");
        return validAlph();
    }

    public static String askType(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        System.out.println("「Learn」「Practice」");
        System.out.println("What would you like to do?");
        return validType();
    }
}
