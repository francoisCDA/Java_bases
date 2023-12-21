public class Generique<T> {


    private T contenu;

    public Generique(T contenu) {
        this.contenu = contenu;
    }

    public T getContenu(){
        return contenu;
    }

    public void setContenu(T contenu){
        this.contenu = contenu ;
    }

}


