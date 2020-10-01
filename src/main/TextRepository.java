package main;

import java.util.Iterator;

public class TextRepository implements Container {
    
    public String[] getWords(String text) {
        String[] words = {};
        String alphanum = "abcçdefgğhıijklmnoöprsştuüvwxyz"
                + "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVWXYZ"
                + "1234567890";
        
        words = text.split(" ");

        for(int i = 0; i < words.length; i++) {
            int l = (words[i]).trim().length() - 1;
            char ilk = words[i].charAt(0);
            while(!alphanum.contains(ilk + "")) {
                StringBuilder sb;
                sb = new StringBuilder(words[i]);
                sb.deleteCharAt(0);
                words[i] = sb.toString();
                ilk = words[i].charAt(0);
            }
            l = (words[i]).trim().length() - 1;
            char son = words[i].charAt(l);
            while(!alphanum.contains(son + "")) {
                StringBuilder sb;
                sb = new StringBuilder(words[i]);
                sb.deleteCharAt(l);
                words[i] = sb.toString();
                l = (words[i]).trim().length() - 1;
                son = words[i].charAt(l);
            }
        }
        return words;
    }

    @Override
    public Iterator getIterator() {
        return new TextIterator();
    }
    
    private class TextIterator implements Iterator {
        
        String[] words = getWords(TextEditorGUI.textArea.getText());
        int index;

        @Override
        public boolean hasNext() {
            if(index < words.length) return true;
            else return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()) return words[index++];
            else return null;
        }
    }
}
