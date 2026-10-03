import java.util.*;
class Solution {
    
    static class Song implements Comparable<Song> {
        int id;
        int play;
        
        public Song(int id, int play) {
            this.id = id;
            this.play = play;
        }
        
        @Override
        public int compareTo(Song song) {
            if (this.play == song.play) {
                return this.id - song.id;
            }
            return song.play - this.play;
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> genre_list = new HashMap<>();
        HashMap<String, List<Song>> song_info_list = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            genre_list.put(genre, genre_list.getOrDefault(genre, 0) + play);
            if (!song_info_list.containsKey(genre)) {
                song_info_list.put(genre, new ArrayList<>());
            }
            song_info_list.get(genre).add(new Song(i, play));
        }
        
        List<String> sorted_genre = new ArrayList<>(genre_list.keySet());
        sorted_genre.sort((a, b) -> genre_list.get(b) - genre_list.get(a));
        
        List<Integer> answer = new ArrayList<>();
        
        for (String s : sorted_genre) {
            List<Song> sorted_songs = song_info_list.get(s);
            Collections.sort(sorted_songs);
            
            answer.add(sorted_songs.get(0).id);
            if (sorted_songs.size() >= 2) 
                answer.add(sorted_songs.get(1).id); 
        }
        
        int[] answer_list = new int[answer.size()];
        for (int i = 0; i <answer.size(); i++) {
            answer_list[i] = answer.get(i);
        }
        
        return answer_list;
    }
}

/*
[pop, classic]
pop = [Song(id, play), Song(id, play)] c = [Song(id, play), Song(id, play), Song(id, play)]

*/