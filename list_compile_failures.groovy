def failed_items = [] Jenkins.instance.allItems.findAll { item -> item.disabled != true && item.getLastBuild().result != Result.SUCCESS }.each { item -> failed_items.add(item.name) } failed_items
