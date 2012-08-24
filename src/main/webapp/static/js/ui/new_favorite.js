$(function() {
    $.mobile.ajaxEnabled = false;

    var favorite = new FavoriteTimesheet();

    $.validator.addMethod("duplicateFavorite", favorite.existsFavoriteName);

    $("#new_favorite_form").validate({
        rules: {
            name: {
                duplicateFavorite : true,
                required: true
            }
        },
        messages: {
            name: {
                required: "Name field cannot be left blank.",
                duplicateFavorite: "Duplicate name. Please try another name."
            }
        }
    });
});