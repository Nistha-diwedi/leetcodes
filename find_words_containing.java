class find_words_containing {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> arr = new ArrayList<>();

        for(int i=0; i<words.length; i++){
            if(words[i].contains(String.valueOf(x))){
                arr.add(i);
            }
        }
        return arr;
    }
}
