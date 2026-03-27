import Productos.*;
import src.Mixdown.AdaptadorDiscoMusical;
import src.Mixdown.DiscoMusical;
import src.Productos.Pelicula;
import Mixdown.*;
//import Catalogo.Catalogo;

/**
 * Clase principal que ejecuta el catálogo de RockBuster. 
 * Crea los productos: películas, sagas, discos, y muestra el menú interactivo.
 * 
 * @author Syntax Error 
 */
public class Rockbuster {
    /**
     * Método principal que inicia el programa.
     * @param args argumentos de línea de comandos (no utilizados) 
     */
    public static void main(String[] args) {
        System.out.println("**************************************************");    
        System.out.println("Bienvenido a la tienda RockBuster");
        System.out.println("**************************************************");

        Catalogo catalogo = new Catalogo();

        // --Creación de películas--
        // Trilogía Original
        Pelicula starWars4 = new Pelicula(
            "Star Wars Episodio IV: Una Nueva Esperanza",
            "George Lucas",
            "Ciencia Ficción",
            "Un joven granjero se une a un caballero Jedi para rescatar a una princesa y enfrentar al Imperio Galáctico.", 
            70.00,
            150
        );

        Pelicula starWars5 = new Pelicula(
            "Star Wars Episodio V: El Imperio Contraataca",
            "Irvin Kershner",
            "Ciencia Ficción",
        "El imperio contraataca y Luke Skywalker enfrenta una impactante revelación sobre su padre.",
        75.00,
        124
        );

        Pelicula starWars6 = new Pelicula(
            "Star Wars Episodio VI: El Retorno del Jedi",
            "Richard Marquand",
            "Ciencia Ficción",
        "La Alianza Rebelde enfrenta al Imperio en una batalla final por la libertad de la galaxia.",
        80.00,
        131
        );

        // Trilogia de precuelas 
        Pelicula starWars1 = new Pelicula(
            "Star Wars Episodio I: La Amenaza Fantasma",
            "George Lucas",
            "Ciencia Ficción",
            "Dos caballeros Jedi descubren a un joven esclavo con un potencial excepcional para la fuerza.",
            65.00,
            136
        );

        Pelicula starWars2 = new Pelicula(
            "Star Wars Episodio II: El Ataque de los Clones",
            "George Lucas",
            "Ciencia Ficción",
            "Obi-Wan investiga un intento de asesinato mientras Anakin se convierte en el guardaespaldas de Padmé.",
            75.00,
            142
        );

        Pelicula starWars3 = new Pelicula(
            "Star Wars Episodio III: La Venganza de los Sith",
            "George Lucas",
            "Ciencia Ficción",
            "Anakin Skywalker cae al lado oscuro y se convierte en Darth Vader.",
            85.00,
            140
        );

        // Trilogía de Secuelas
        Pelicula starWars7 = new Pelicula(
            "Star Wars Episodio VII: El Despertar de la Fuerza",
            "J.J. Abrams",
            "Ciencia Ficción",
            "Una nueva amenaza surge mientras una joven scavenger descubre su conexión con la Fuerza.",
            90.00,
            138
        );

        Pelicula starWars8 = new Pelicula(
            "Star Wars Episodio VIII: Los Últimos Jedi",
            "Rian Johnson",
            "Ciencia Ficción",
            "Luke Skywalker entrena a Rey mientras la Resistencia enfrenta a la Primera Orden.",
            80.00,
            152
        );

        Pelicula starWars9 = new Pelicula(
            "Star Wars Episodio IX: El Ascenso de Skywalker",
            "J.J. Abrams",
            "Ciencia Ficción",
            "La conclusión de la saga Skywalker donde los últimos Jedi enfrentan al Emperador.",
            60.00, 
            142
        );

        // Película independiente
        Pelicula rogueOne = new Pelicula(
            "Rogue One: Una Historia de Star Wars",
            "Gareth Edwards",
            "Ciencia Ficción",
            "Un grupo de rebeldes se une para robar los planos de la Estrella de la Muerte.",
            75.00,
            133
        );

        // Película independiente
        Pelicula elGranShowman = new Pelicula(
            "El Gran Showman",
            "Michael Gracey",
            "Musical",
            "P.T. Barnum, tras perder su trabajo de oficina, arriesga todo para inaugurar el Museo Americano en el siglo XIX, que evoluciona hacia un circo con atracciones humanas únicas y extraordinarias.",
            68.50,
            105
        );

        // Saga Indiana Jones
        Pelicula indianaJones1 = new Pelicula(
            "Indiana Jones y los cazadores del arca perdida",
            "Steven Spielberg",
            "Aventura/ Acción",
            "Después de una infructuosa misión en Sudamérica, el Gobierno estadounidense encarga al arqueólogo Indiana Jones la búsqueda del Arca de la Alianza, una reliquia bíblica que contiene los diez mandamientos y que convierte en invencible a su portador. Jones deberá enfrentarse a los nazis para adquirir este precioso objeto." , 
            70.50,
            115
        );

        Pelicula indianaJones2 = new Pelicula(
            "Indiana Jones y el templo maldito",
            "Steven Spielberg",
            "Aventura/ Acción",
            "En Shanghái, Indiana Jones se mete en un lío con unos gánsters que compiten por una joya. Finalmente consigue escapar del lugar con una bella cantante y su joven acompañante. Los tres escapan en una avioneta que, tras un accidentado vuelo, aterriza en el corazón de la India. Allí intentarán ayudar a los habitantes de un pequeño poblado que ha quedado devastado después del robo de una joya sagrada con poderes." , 
            85.00,
            118
        );

        Pelicula indianaJones3 = new Pelicula(
            "Indiana Jones y la última cruzada",
            "Steven Spielberg",
            "Aventura/ Acción",
            "El intrépido explorador Indiana Jones tiene que rescatar a su padre, un arqueólogo que ha desaparecido mientras buscaba el Santo Grial. Siguiendo las pistas de la libreta de su padre, Indiana llega a Venecia, donde recibe la ayuda de una profesora especialista. Los dos intentarán rescatar a Henry Jones y, de paso, hacerse con la preciada reliquia, que también quieren los nazis." , 
            90.00,
            127
        );

        Pelicula indianaJones4 = new Pelicula(
            "Indiana Jones y el reino de la calavera de cristal",
            "Steven Spielberg",
            "Aventura/ Acción",
            "Indiana conoce a Mutt, un joven rebelde que le propone un trato: si le ayuda a resolver un problema personal, él, a cambio, le facilitaría uno de los descubrimientos más espectaculares de la historia: la Calavera de Cristal de Akator, que se encuentra en un lugar remoto del Perú." , 
            85.00,
            122
        );

        Pelicula indianaJones5 = new Pelicula(
            "Indiana Jones y el llamado del destino",
            "James Mangold",
            "Aventura/ Acción",
            "En 1969, un Indiana Jones envejecido y derrotado por la vida regresa a la acción para evitar que la hija de uno de sus amigos venda un artilugio que permite viajar en el tiempo a unos nazis que pretenden alterar el curso de la Segunda Guerra Mundial." , 
            78.00,
            154
        );

        // Pelicula independiente
        Pelicula milagrosDelCielo = new Pelicula(
            "Milagros del Cielo",
            "Patricia Riggen",
            "Drama",
            "La conmovedora historia de Kevin y Kristy, un matrimonio que descubre que su hija Anna, de diez años, tiene una enfermedad incurable y comienza la búsqueda de una posible cura. En este recorrido, todo se agrava cuando Anna sufre un accidente, pero será el momento en el que comienzan a suceder una serie de milagros que dejarán a la familia y a la comunidad tan desconcertadas como conmovidas.",
            80.00,
            109
        );

        // Pelicula independiente
        Pelicula hombreAlAgua = new Pelicula(
            "Hombe al agua",
            "Rob Greenberg",
            "Comedia Romántica", 
            "Leonardo es un millonario mexicano, egoísta y caprichoso; Kate es una madre soltera contratada para limpiar su yate. Después de despedir injustamente a Kate y negarse a pagarle, Leonardo cae por la borda y se despierta con amnesia. Kate aparece en el hospital y, para vengarse, convence a Leonardo de que él es su esposo.",
            80.50, 
            112
        );

        // -- Creación de Sagas con Composite --
        // Trilogía original
        Saga trilogiaOriginal = new Saga("Saga: Trilogía Original", "Ciencia Ficción");
        trilogiaOriginal.agregar(starWars4);
        trilogiaOriginal.agregar(starWars5);
        trilogiaOriginal.agregar(starWars6);
        
        // Trilogía de precuelas
        Saga trilogiaPrecuelas = new Saga("Saga: Trilogía de Precuelas", "Ciencia Ficción");
        trilogiaPrecuelas.agregar(starWars1);
        trilogiaPrecuelas.agregar(starWars2);
        trilogiaPrecuelas.agregar(starWars3);

        // Trilogía de secuelas
        Saga trilogiaSecuelas = new Saga("Saga: Trilogía de Secuelas", "Ciencia Ficción");
        trilogiaSecuelas.agregar(starWars7);
        trilogiaSecuelas.agregar(starWars8);
        trilogiaSecuelas.agregar(starWars9);

        //Saga completa
        Saga sagaCompletaStarWars = new Saga("Saga: Star Wars - La Colección Completa", "Ciencia Ficción");
        sagaCompletaStarWars.agregar(trilogiaPrecuelas);
        sagaCompletaStarWars.agregar(rogueOne);
        sagaCompletaStarWars.agregar(trilogiaOriginal);
        sagaCompletaStarWars.agregar(trilogiaSecuelas);

        // Saga de Indiana Jones
        Saga sagaCompletaIndianaJones = new Saga("Saga: Indiana Jones", "Aventura/Acción");
        sagaCompletaIndianaJones.agregar(indianaJones1);
        sagaCompletaIndianaJones.agregar(indianaJones2);
        sagaCompletaIndianaJones.agregar(indianaJones3);
        sagaCompletaIndianaJones.agregar(indianaJones4);
        sagaCompletaIndianaJones.agregar(indianaJones5);

        // -- Creación de Discos de Mixdown para usar el patrón adapter--

        DiscoMusical discoPinkFloyd = new DiscoMusical(
            "The Dark Side of the Moon",
            "Pink Floyd",
            "Rock Progresivo",
            1973, 
            390.00
        );
        
        DiscoMusical discoTheBeatles = new DiscoMusical(
            "Abbey Road", 
            "The Beatles", 
            "Rock y pop", 
            1969, 
            450.00
        );

        DiscoMusical discoFrankSinatra = new DiscoMusical(
            "Nothing But the Best", 
            "Frank Sinatra", 
            "Jazz y pop", 
            2008, 
            350.00
        );

        DiscoMusical discoJoseJose = new DiscoMusical(
            "El triste",
            "José José",
            "Balada / Pop Latino",
            1970, 
            299.67
        );

        DiscoMusical discoJuanGabriel = new DiscoMusical(
            "Juan Gabriel en El Palacio de Bellas Artes",
            "Juan Gabriel",
            "Regional Mexicana",
            1990, 
            275
        );

        DiscoMusical discoShakira = new DiscoMusical(
            "Pies Descalzos",
            "Shakira",
            "Pop / Rock",
            1995, 
            360
        );

        // Adaptamos discos
        AdaptadorDiscoMusical adaptarPinkFloyd = new AdaptadorDiscoMusical(discoPinkFloyd);
        AdaptadorDiscoMusical adaptarTheBeatles = new AdaptadorDiscoMusical(discoTheBeatles);
        AdaptadorDiscoMusical adaptarFrankSinatra = new AdaptadorDiscoMusical(discoFrankSinatra);
        AdaptadorDiscoMusical adaptarJoseJose = new AdaptadorDiscoMusical(discoJoseJose);
        AdaptadorDiscoMusical adaptarJuanGabriel = new AdaptadorDiscoMusical(discoJuanGabriel);
        AdaptadorDiscoMusical adaptarShakira = new AdaptadorDiscoMusical(discoShakira);

        // --Agregamos los productos al catálogo--
        // peliculas individuales
        catalogo.agregarProducto(starWars4);
        catalogo.agregarProducto(rogueOne);
        catalogo.agregarProducto(elGranShowman);
        catalogo.agregarProducto(milagrosDelCielo);
        catalogo.agregarProducto(hombreAlAgua);

        //sagas pequeñas
        catalogo.agregarProducto(trilogiaOriginal);
        catalogo.agregarProducto(trilogiaPrecuelas);
        catalogo.agregarProducto(trilogiaSecuelas);

        //sagas compuestas (colección completa)
        catalogo.agregarProducto(sagaCompletaStarWars);
        catalogo.agregarProducto(sagaCompletaIndianaJones);
        
        // discos adaptados
        catalogo.agregarProducto(adaptarPinkFloyd);
        catalogo.agregarProducto(adaptarTheBeatles);
        catalogo.agregarProducto(adaptarFrankSinatra);
        catalogo.agregarProducto(adaptarJoseJose);
        catalogo.agregarProducto(adaptarJuanGabriel);
        catalogo.agregarProducto(adaptarShakira);

        System.out.println("\n Catálogo creado exitosamente con " + catalogo.getCantidadProductos() + "productos");

        // Mostrar menú
        catalogo.mostrarMenu();
    }
}