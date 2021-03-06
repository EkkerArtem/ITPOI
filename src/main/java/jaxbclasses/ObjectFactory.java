
package jaxbclasses;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxbclasses package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Games_QNAME = new QName("", "games");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxbclasses
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GameType }
     * 
     */
    public GameType createGameType() {
        return new GameType();
    }

    /**
     * Create an instance of {@link GameType.Rating }
     * 
     */
    public GameType.Rating createGameTypeRating() {
        return new GameType.Rating();
    }

    /**
     * Create an instance of {@link GameType.Producer }
     * 
     */
    public GameType.Producer createGameTypeProducer() {
        return new GameType.Producer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "games")
    public JAXBElement<GameType> createGames(GameType value) {
        return new JAXBElement<GameType>(_Games_QNAME, GameType.class, null, value);
    }

}
