package com.example.mymoviedb.database

import com.example.mymoviedb.model.Movie

class Movies {
    fun getMovies(): List<Movie>{
        return listOf<Movie>(
            Movie(
                950387,
                "A Minecraft Movie",
                "/yFHHfHcUgGAxziP1C3lLt0q2T4s.jpg",
                "/2Nti3gYAX513wvhp8IiLL6ZDyOm.jpg",
                "2025-03-31",
                "Four misfits find themselves struggling with ordinary problems when they are suddenly pulled through a mysterious portal into the Overworld: a bizarre, cubic wonderland that thrives on imagination. To get back home, they'll have to master this world while embarking on a magical quest with an unexpected, expert crafter, Steve."
            ),
            Movie(
                324544,
                "In the Lost Lands",
                "/iHf6bXPghWB6gT8kFkL1zo00x6X.jpg",
                "/op3qmNhvwEvyT7UFyPbIfQmKriB.jpg",
                "2025-02-27",
                "A queen sends the powerful and feared sorceress Gray Alys to the ghostly wilderness of the Lost Lands in search of a magical power, where the sorceress and her guide, the drifter Boyce must outwit and outfight man and demon."
            ),
            Movie(
                1195506,
                "Novocaine",
                "/xmMHGz9dVRaMY6rRAlEX4W0Wdhm.jpg",
                "/bYVygxg5enGs89V5qgejbWl0Oq6.jpg",
                "2025-03-12",
                "When the girl of his dreams is kidnapped, everyman Nate turns his inability to feel pain into an unexpected strength in his fight to get her back."
            )
        )
    }
}