public interface IRepository<IBusinessObject> {
	IBusinessObject get(long Id);
	
	long store(IBusinessObject bo);
	
	Iterable<IBusinessObject> findBy(Object criteria);
	
	Iterable<IBusinessObject> getAll();
}
