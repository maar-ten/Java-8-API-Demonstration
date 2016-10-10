@EnhancedRequest(id = 1, synopsis = "what ever")
public class AnnotationExercise {
}

@interface EnhancedRequest {
    int id();

    String synopsis();

    String engineer() default "undeclared";

    String date() default "unknown";
}
