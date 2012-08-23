$(function() {
    var newFavorite = new FavoriteTimesheet();

    $("#name").change(function(){
        newFavorite.setName($(this).val());
    });

    $("#submit").click(function(){
        if ( !newFavorite.validate() ) {
            alert(newFavorite.getErrors()[0].message);
            return false;
        } else {
            alert("Nice");
        }
    });
});