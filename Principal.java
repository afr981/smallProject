public class Principal {
    public static void main(String [] args) {
	ReadProperites props= new ReadProperites();
        System.out.println("Bienvenido a "+props.getmensaje() );
	System.out.println("Suma "+new Suma().add(3,4));
    }
}
