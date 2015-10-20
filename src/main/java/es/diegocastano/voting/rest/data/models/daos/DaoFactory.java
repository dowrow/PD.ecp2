package es.diegocastano.voting.rest.data.models.daos;

public abstract class DaoFactory {
    
    public static DaoFactory factory = null;

    public static void setFactory(DaoFactory factory) {
        DaoFactory.factory = factory;
    }

    public static DaoFactory getFactory() {
        assert factory != null;
        return factory;
    }

	public ThemeDao getThemeDao() {
		// TODO Auto-generated method stub
		return null;
	}

	public VoteDao getVoteDao() {
		// TODO Auto-generated method stub
		return null;
	}

    //public abstract Entity1Dao getEntity1Dao();

    //public abstract Entity2Dao getEntity2Dao();

}
