$(function() {
    $.mobile.ajaxEnabled = false;

    $.validator.addMethod("duplicateFavorite", function(value) {

        var isValid = true;

        $('#existingFavorites > li').each(function(){
            if ( $(this).text() == value ) {
                isValid = false;
            }
        });

        return isValid;
    }, 'Duplicate name. Please try another name.');


    $("#new_favorite_form").validate({
        rules: {
            name: {
                duplicateFavorite : true,
                required: true
            }
        }
    });
});