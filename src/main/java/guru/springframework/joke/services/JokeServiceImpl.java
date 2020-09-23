package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{

    //DI INJECTED
    private final ChuckNorrisQuotes chuckNorrisQuotes;
    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    // ovdje uzima random qoute i sprema u getjokes u interface koji se poziva u kontroleru
    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
