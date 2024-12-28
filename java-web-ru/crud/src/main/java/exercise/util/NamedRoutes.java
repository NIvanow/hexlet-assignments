package exercise.util;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class NamedRoutes {

    public static String rootPath() { return "/";}

    // BEGIN
    @NotNull
    @Contract(pure = true)
    public static String postPath() {return "/posts/{id}";}
    public static String postsPath() {return "/posts";}
    // END
}
