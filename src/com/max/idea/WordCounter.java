package com.max.idea;

import java.util.*;

/**
 * Счетчик слов
 */
public class WordCounter {

    /**
     * Подсчет кол-ва повторов слов
     * @param scanner сканер для чтения наборо слов
     * @return кол-ва повторов по каждому слову
     */
    public Map<String, Integer> Count(Scanner scanner) {
        ArrayList<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add( scanner.next() );
        }

        // Сортируем с учетом регистра (в задании ничего не сказано про регистр)
        words.sort( Comparator.naturalOrder() );

        Map<String, Integer> result = new HashMap<>();
        String prevWord = words.get( 0 );
        int prevCount = 0;
        for (String word : words) {
            if (!prevWord.equals( word ) ) {
                result.put( prevWord, prevCount );
                prevCount = 1;
                prevWord = word;
            } else prevCount++;
        }
        result.put( prevWord, prevCount );

        return result;
    }
}
