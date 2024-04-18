package strategy;

public class Snooper {
    private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;

        model.addQueryObserver( new WebSearchModel.QueryObserver() {
        	
        	Filter filter = new FilterWord();
        	
        	@Override
            public void onQuery(String query) {
                if (filter.interested(query)) {
                	filter.print(query);
                }
            }
        });
        
        model.addQueryObserver( new WebSearchModel.QueryObserver() {
        	
        	Filter filter = new FilterCaracter();
        	
        	@Override
            public void onQuery(String query) {
                if (filter.interested(query)) {
                	filter.print(query);
                }
            }
        });
    }
}