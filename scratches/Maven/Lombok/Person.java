import lombok.*;

class Scratch {
    @ToString
    @RequiredArgsConstructor
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode(onlyExplicitlyIncluded = true)  // réécrit la .equals
    public class Person {

        @Getter
        @Setter
        @NonNull
        private int id;

        @Getter
        @Setter
        @EqualsAndHashCode.Include // paramètre utilisé pour la réécriture de .equals
        private String nom;

        @EqualsAndHashCode.Include // paramètre utilisé pour la réécriture du .equals
        private String prenom;
    
}