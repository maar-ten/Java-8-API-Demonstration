import java.lang.annotation.Repeatable;

@Name(value = "foobar")
@Name(value = "rules")
public class RepeatableAnnotations {

}

@Repeatable(Names.class)
@interface Name {
    String value();
}

@interface Names{
    Name[] value();
}
