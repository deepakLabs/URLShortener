package startegy;

public class HashCodeStartegy implements URLShortenerStrategy{
    @Override
    public String shortenURL(String url) {
        String hashCodeOfURL = String.valueOf(url.hashCode());
        hashCodeOfURL = hashCodeOfURL.substring(0,6);
        return hashCodeOfURL;
    }
}
