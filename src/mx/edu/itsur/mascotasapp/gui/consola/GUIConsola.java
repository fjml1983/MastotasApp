package gui.consola;

/**
 *
 * @author FJML1983
 */
public class GUIConsola {

    public static void imprimirMenu() {
        System.out.println("1. Ver mascotas :D");
        System.out.println("2. Alimentar mascota.");
        System.out.println("3. Asear mascota.");
        System.out.println("4. Jugar con mascota.");
        System.out.println("5. Llevar mascota a veterinario.");
        System.out.println("6. Adoptar nueva mascota.");
    }

    public static void imprimirPerroLadrando() {
        //Dibujar un perro ladrando en caracteres ASCII.
        String perro
                = """
                  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#.P@@@@@@
                  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@P:5@@@@G.P@@@@@@@
                  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@P.   ~@@B:#@@&G??@@
                  @@@@@@@@@@@@@@@@@@@@@@@@@&@@@G^:     ^@@@@5!75#@@@
                  @@@@@@@@@@@@@@@@@@@@@@@@@? .. :#!   ^&@@@@&&@@@@@@
                  @@@@@@@@@@@@@@@@@@@@@@@@@Y         .GB&@@@@Y??????
                  ^ .7G&@@@@@@@@@@@@@@@@@@@P7:        .5@@@@@@@@@@@@
                  5~                     .~YB&&#P?: .5@@@@@@@@@@@@@@
                  @@@&?                       .~JG&@@@@@@@@@@@@@@@@@
                  @@@@&                           7@@@@@@@@@@@@@@@@@
                  @@@@&                           7@@@@@@@@@@@@@@@@@
                  @@@@&                           7@@@@@@@@@@@@@@@@@
                  @@@@&           ~7!!!!!!!!.     B@@@@@@@@@@@@@@@@@
                  @@@@&     ^     ^&@@@@@@@@?    .@@@@@@@@@@@@@@@@@@
                  @@@@&     B#.     G@@@@@@@7    .@@@@@@@@@@@@@@@@@@
                  @@@@&     B@&^     ?@@@@@@7    .@@@@@@@@@@@@@@@@@@
                  @@@@&     B@@@J     !@@@@@7    .@@@@@@@@@@@@@@@@@@
                  @@@@@?   ~@@@@@B.  .G@@@@@&:  .P@@@@@@@@@@@@@@@@@@""";
        System.out.println(perro);
    }

    public static void imprimirGatoMaullando() {
        //Dibujar un gato maullando en caracteres ASCII.
        String gato
                = """
                      @?   ~#@@@@@@@@@@@@@@@@@@@G.  .B@@@@@@@@@@@@@@@@@@@@
                      @  7J  ^B@@@&BP5Y5PB&@@@5. .P. ~@@@@@@@@@@@@@@@@@@@@
                      @  Y@@Y. ..  ..:::..  :  :B@@: ~@@@@@@@@@@@@@@@@@@@@
                      @  Y@@@@P~JB@@@@@@@@&G77#@@@@: ~@@@@@@@@@@@@@@@@@@@@
                      @  Y@@@@@@@@@@@@@@@@@@@@@@@@@: ~@@@@@@@@@@@@@@@@@@@@
                      @  Y@@@B~P@@@@@@@@@@@@@?7@@@@: ~@@@@@@@@@@&!.   :5@@
                      @  !@@@#?G@@@@@@@@@@@@@YJ&@@&. 7@@@@@@@@@#  7&&B. ^@
                      @7   ..:B@@@@&&P7B&&@@@@J...   &@@@@@@@@@Y  @@@@Y  @
                      @@: .J7~#@@@B.. . .^@@@@P~??   Y&@@@@@@@@Y  @@@@Y  @
                      @@@^   ^#@@@@@&@@@@@@@@@Y.   77. .!G@@@@@Y  @@@@Y  @
                      @@@@Y  ~#@@@@@@@@@@@@@@@P. :B@@@#J:  :Y&@Y  @@@@Y  @
                      @@@@@@Y. .7P#&@@@@@&BY^  ^G@@@@@@@@&G~  ..  @@@@Y  @
                      @@@@@@@@#     ....   .!P&@@@@@@@@@@@@@@#J:  ~#@@Y  @
                      @@@@@@@@@. !@&#BBB#&@@@@@@@@@@@@@@@@@@@@@@&Y. :#Y  @
                      @@@@@@@@@~ :@@@@@@@@@@@@@@@@@@@@@&BY?!~G@@@@@Y  .  @
                      @@@@@@@@@G  #@@@@@@@@@@@@@@@@@&J.  :~77B@@@@@@&.   @
                      @@@@@@@@@@~ .@@@@@@@@@@@@@@@@7  !B@@@@@@@@@&@@@#   @
                      @@@@@@@@@@@: :@@@@@@@@@@@@@&. ^&@@@@@@@@@@J .@@@!  @
                      @@@@@@@@@@@&  Y@@@#J#@@@@@@~ .@@@@@@@@@@@@5  &@@Y  @
                      @@@@@@@@@@@@  Y@@@: ^@@@@@@  Y@@@@@@@@@@@@^ .@@@~ .@
                      @@@@@@@@@@@@  Y@@@: ^@@@@@@: ~@@@@@@@@@@@Y  #@@B  P@
                      @@@@@@@@@&GJ  Y@@@: ^@@BJ~!.  P@@@@@@@@@@@#@@@B  ?@@
                      @@@@@@@@5  ^!!&@@@^ .B^ .??JJJ#@@@@@@@@@@@@@&!  5@@@
                      @@@@@@@@. ^&&&&&&#. ..  5@&&&&&&&&&&&&&#BP7.  ?&@@@@
                      @@@@@@@@Y          7@@!                   :?B@@@@@@@
                      """;
        System.out.println(gato);
    }
}
