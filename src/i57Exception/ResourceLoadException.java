package i57Exception;

public class ResourceLoadException extends ChainedException {
    public ResourceLoadException(String message) {
        super(message);
    }
    public ResourceLoadException(String message, Throwable cause) {
        super(message, cause);
    }
}
