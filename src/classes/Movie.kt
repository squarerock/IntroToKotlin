package classes

/**
 * Created by pranavkonduru on 9/2/18.
 */

data class Movie(val name: String,
                 val director: String,
                 var rating : Float,
                 val genre : String = "comedy",
                 val yearReleased : String = "2018")