package Aula169_Collections.SortingLists.binarysearch;

import java.util.Comparator;

import Aula169_Collections.SortingLists.dominio.Manga;

public class MangaByIdComparator implements Comparator<Manga> {

	@Override
	public int compare(Manga o1, Manga o2) {
		// TODO Auto-generated method stub
		return o1.getId().compareTo(o2.getId());
	}

}
