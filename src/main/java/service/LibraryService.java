package service;

import DAO.LibraryDAO;
import model.Library;

public class LibraryService {
	
	private LibraryDAO libraryDao = new LibraryDAO();

    public void addLibrary(Library lib) {
        libraryDao.addLibrary(lib);
    }
    public void updateLibrary(Library lib) {
        libraryDao.updateLibrary(lib);
    }
}
	   
